import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import javax.xml.crypto.Data;

public class Serialization
{
    public static String getDay(int d)
    {
        String day = null;

        switch(d)
        {
            case 0: day= "Sunday"; break;
            case 1: day= "Monday"; break;
            case 2: day= "Tuesday"; break;
            case 3: day= "wednesday"; break;
            case 4: day= "Thursday"; break;
            case 5: day= "Friday"; break;
            case 6: day= "Saturday"; break;
        }
        return day;
    }
    public static void main(String[] args) {
        SerialDemo sd;

        Date date = new Date();

        String day = new String(getDay(date.getDay()));
        String time = new String(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());

        // System.out.println(day+"  \t"+time);

        sd = new SerialDemo(day, time);

        try {
            FileOutputStream fis = new FileOutputStream("object.ob");
            ObjectOutputStream out = new ObjectOutputStream(fis);

            out.writeObject(sd);

            System.out.println("Serialization is Done");

            out.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}