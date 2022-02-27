class K
{
    void add()
    {
        int a = 10, b = 20;
        int c = a+b;
        System.out.println("Sum = " + c);
    }
    void add(int x, int y)
    {
        int z = x + y;
        System.out.println("Sum = " + z);
    }
}
class MOverload
{
    public static void main(String[] args) {
       K obj = new K();
       obj.add();
       obj.add(40,50);
    }
}
// method overloading