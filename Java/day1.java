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
        int number1 = scan.nextInt();
        double number2 = scan.nextDouble();
        int sum1;
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