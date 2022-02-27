import java.util.Scanner;

/**
 * Area
 */
public class Area 
{

    public static void main(String[] args) 
    {
        int r;
        double pi = 3.14, area;
        Scanner in = new Scanner (System.in);
        System.out.print("Enter radius of circle:");
        r = in.nextInt();
        in.close();
        area = pi*r*r;
        System.out.println("Area of circle:"+area);      
    }    
}