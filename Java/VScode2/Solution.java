import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        

        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        /* Read and save an integer, double, and String to your variables.*/
        System.out.print("enter the first number: ");
        int number1 = scan.nextInt();
        System.out.print("enter the second number: ");
        double number2 = scan.nextDouble();
        int sum1;
        System.out.print("enter the String: ");
        double sum2;scan.nextLine();
        String userinput = scan.nextLine();
        
        
        
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
        sum1 = number1 + i;
        sum2 = number2 + d;
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(s + userinput);
	        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        scan.close();
    }
}