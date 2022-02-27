class Operators
{
    private int a, b;

    public Operators()
    {}
    public Operators(int a, int b) 
    {
        this.a = a;
        this.b = b;      
    }

    public void performIlerative()
    {
        int c = a++;
        System.out.println(a + " " + c);

        c = ++a;
        System.out.println(a + " " + c);

        c = a--;
        System.out.println(a + " " + c);

        c = --a;
        System.out.println(a + " " + c);
        
    }


    public void performBitwise()
    {
        System.out.println("A&B is :" + (a&b));
        System.out.println("A|B is :" + (a|b));
        System.out.println("A^B is :" + (a^b));
        System.out.println("~A is :" + (~a));
        System.out.println("~B is :" + (~b));
        System.out.println("A<<3 :" + (a<<3));
        System.out.println("A>>3 :" + (a>>3));
    }
}

public class Operatorsdemo 
{
    public static void main(String[] args) 
    {
        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.println("Enter Values for A & B:");

        int a = in.nextInt();
        int b = in.nextInt();
        in.close();

        Operators op = new Operators(a,b);
        op.performIlerative();
        op.performBitwise();
        
    }
}