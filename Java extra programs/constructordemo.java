// constructor demo
class X
{
    String name;
    int rno;
    X()
    {
        name = "ABC";
        rno = 123;
    }
    X(Sring str, int n)
    {
        name = str;
        rno = n;
    }
    public static void main(String[] args) {
        X s1 = new X();
        X s2 = new X("DEF",456);
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s2.name);
        System.out.println(s2.rno);
    }
}