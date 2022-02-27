import java.util.Scanner;

public class table 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = in.nextInt();
        in.close();
        for(int i = 0; i <= 10; i++)
        {
            System.out.println(n + " * " + i + " = " + n*i);
        }


    }
        
    
    
}