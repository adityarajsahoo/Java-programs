class Demo
{
    static int a = 10;
    static void display()
    {
        System.out.println("StaticMethod");
    }
    static
    {
        System.out.println("StaticBlock");
    }
}
class StaticDemo
{
    public static void main(String[] args) 
    {
        System.out.println(Demo.a);
        Demo.display();
    }
}