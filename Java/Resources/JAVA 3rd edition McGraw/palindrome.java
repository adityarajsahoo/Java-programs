import java.lang.System;
import java.lang.Integer;
import.Java.lang.class.

public class palindrome 
{
    public static void main(String[] args) 
    {
        int n, sum, t;

        n = Integer.parseInt(args[0]);
        sum = 0;
        t = n;
        while (n!=0)
        {
            r = n % 10;
            sum = (sum*10) + r;
            n = n/10;
            
            
        }

        if(sum == t)
        {
            System.out.println("\n Palindrome");
        }
        else
        {
            System.out.println("\n not a Palindrome");
        }
    }

    
}