/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Ihosvany Marquez
 */

package Exercise15;

import java.util.Scanner;

public class Solution15
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your username:");
        String username = scan.next();

        System.out.print("Please enter your password:");
        String password = scan.next();

        if(password.contains("abc$123"))
        {
            System.out.print("Welcome " + username + "!");
        }
        else
        {
            System.out.printf("I don't know you, that is not the correct password for user: " + username);
        }
    }
}
