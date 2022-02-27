import java.util.Scanner;

public class question4 
{
    public static void main(String[] args) 
    {
        System.out.println("enter the size of 2D array: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(); // r = rows
        int c = sc.nextInt(); // c = columns
        System.out.println("enter the elements of array: ");
        int a[][] = new int[r][c]; // a = multi dimentional array

        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println(" given data is : ");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.println(a[i][j] + "");
            }
            System.out.println();
        }

        System.out.println("1D array is:");

        int answer[] = new int[a.length*a[0].length];
        int num = 0;
        for(int i = 0; i < a.length; i++);
        {
            int[] r = a[i];
            for(int j = 0; j < a[0].length; j++)
            {          
                answer[num] = a[i][j];
                num++;
            }
        }
        for(int i = 0; i < answer.length; i++)
        {
            System.out.print(answer[i] + " ");
        }
    }
}