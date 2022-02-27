import java.util.Scanner;

/*
Java program for divisibility of 3 and 5
*/
public class code 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner in = new Scanner (System.in);
        System.out.println("enter any number:");
        n= in.nextInt();
        in.close();
        if(n % 5 == 0 && n % 3 == 0)
        {
            System.out.println(n +" "+ "is divisible by 3 and 5");
        }
        else
        {
            System.out.println(n +" "+ "is not divisible by 3 and 5");
        }
    }
}