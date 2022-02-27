import java.util.Scanner;

public class sum 
{
    public static void main(String[] args)
    {
        int num, count, total = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = in.nextInt();
        in.close();
        for(count = 0; count <= num; count++)
        total = total + count;
        System.out.println("sum of first " + num + " natural numbers is: "+ total);        
    }
}