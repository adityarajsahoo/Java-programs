import java.util.Scanner;

public class pattern 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = in.nextInt();
        in.close();
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
       
    
    }
   

}