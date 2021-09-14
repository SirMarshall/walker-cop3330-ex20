/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carter I. Walker
 *
 *  NOTE:   In the description for Exercise 20, the Example Output is conflicting with the description.
 *          The description states a "Dunn" county with an additional tax of 0.004 , while the output
 *          states a "Dane" county, with an additional tax of 0.005.
 *          I assumed it would be the wisest to follow the description rather than sample output,
 *          please forgive any confusion. Thanks!
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //Necessary Variables
        Scanner input = new Scanner(System.in);
        String state,county;
        double amount, wisconsinTax = 0.05, illinoisTax = 0.08, taxAmount, total;

        //Order and state query
        System.out.println( "What is the order amount?" );
        amount = input.nextDouble();

        System.out.println( "What state do you live in?");
        state = input.next();

        //If gate
        if (state.equals("Wisconsin"))
        {
            System.out.println("What county do you live in?");
            county = input.next();

            //County tax gate
            if (county.equals("Eau Claire"))
            {
                //Calculation
                taxAmount = amount * (wisconsinTax + 0.005);
                total = amount + taxAmount;
            }
            else if (county.equals("Dunn"))
            {
                //Calculation
                taxAmount = amount * (wisconsinTax + 0.004);
                total = amount + taxAmount;
            }
            else
            {
                //Calculation
                taxAmount = amount * wisconsinTax;
                total = amount + taxAmount;
            }
        }
        else if (state.equals("Illinois")) {
            //Calculation
            taxAmount = amount * illinoisTax;
            total = amount + taxAmount;
        }
        else
        {
            taxAmount = 0;
            total = amount;
        }
        System.out.format("The tax is $%.2f\n", taxAmount);
        System.out.format("The total is $%.2f", total);
    }
}
