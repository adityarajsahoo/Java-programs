import java.util.Scanner;
/*
to find the sum of 1^2 + 2^2 + 3^2 + 4^2 +......
*/
public class series 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        in.close();
        int i;
        int sums = 0;
        for(i = 1; i <= n; i++)
        {
            sums = i*i;
            System.out.print(sums + " ");
        }
    


    }
}