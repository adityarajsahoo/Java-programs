class student
{
    String name;
    int rno;
    student()
    {
        name = "ABC";
        rno = 123;
    }
    public static void main(String[] args) {
        student s1 = new student();
        System.out.println(s1.name);
        System.out.println(s1.rno);
    }
} 
