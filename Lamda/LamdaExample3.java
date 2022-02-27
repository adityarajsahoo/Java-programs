
import java.util.Scanner;

interface ArithmeticOperation
{
    public int doOperation(int a, int b); // i.e Add, Sub, Mul, Div, Modulus
}

interface Factorial
{
    public int fact(int n);
}

public class LamdaExample3
{
    public static void main(String[] args) 
    {
        int p, q;
        int n;

        System.out.println("Enter A, B, & N:");

        Scanner scan = new Scanner(System.in);

        p = scan.nextInt();
        q = scan.nextInt();
        n = scan.nextInt();

        // With parameters and with braces

        ArithmeticOperation add = (int a, int b) -> {return a+b;};

        // With parameters and without braces

        ArithmeticOperation sub = (int a, int b) -> a-b;

        // With parameters (of no datatype) and without braces

        ArithmeticOperation mul = (a,b) -> a*b;

        // With parameters (of no datatype) and with braces

        ArithmeticOperation div = (a,b) -> {return a/b;};

        System.out.println(add.doOperation(p, q));
        System.out.println(sub.doOperation(p, q));
        System.out.println(mul.doOperation(p, q));
        System.out.println(div.doOperation(p, q));

    }
}