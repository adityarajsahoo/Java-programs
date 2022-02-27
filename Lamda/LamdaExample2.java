import java.io.*;


interface Circle
{
    public double getArea();
}

class LamdaExample2
{
    public static void main(String[] args) throws IOException
    {
        double r;

        System.out.println("Enter Radius");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        r = Double.parseDouble(br.readLine());
        Circle c = ()->{return (Math.PI*r*r);};

        System.out.println(c.getArea());        
    }
}