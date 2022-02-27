import java.io.*;

interface Circle
{
    public double getArea();
}
class LamdaExample1
{
    public static void main(String[] args) throws IOException
    {
        double r;

        System.out.println("Enter Radius");
        DataInputStream dis = new DataInputStream(System.in);

        r = Double.parseDouble(dis.readLine());

        Circle c = new Circle()
        {
            public double getArea()
            {
                return (Math.PI*r*r);
            }
        };

        System.out.println(c.getArea());
    }
}