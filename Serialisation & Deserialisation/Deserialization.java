import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.File;

class Deserialization
{
    public static void main(String[] args)
        throws IOException, ClassNotFoundException 
    {
        SerialDemo sd = null;

        ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("object.ob")));

        sd = (SerialDemo)in.readObject();

        System.out.println("Object deserialization is done");

        System.out.println(sd.day + "\t" + sd.time);
    }
}