class ExceptionHandlingDemo
{
    public static void main(String[] args) 
    { 
    int a = 10, b = 0;
    String s = null;
    String str = "hello";

    try 
    {
        System.out.println("First Try");
        try
        {
            System.out.println("Inner Try");
            int c = a/b;
        }
        catch (NullPointerException npe) 
        {
            System.out.println(npe);
        }
        finally
        {
            System.out.println("Finally for Inner Try");
        }
    }
    catch(NumberFormatException nfe)
    {
       System.out.println(nfe);
    }
    catch(ArithmeticException ae)
    {
        System.out.println(ae);
    }
    finally
    {
        System.out.println("Finally for Outer Block");
    }
    }
}
