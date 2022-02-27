import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class StreamDemo
{
    private File file;
    private String fileName;
    private FileInputStream fis;
    private FileOutputStream fos;

    public void StreamDemo()
        throws IOException, FileNotFoundException
        {
            try
            {
                fileName = new String("C:\\Fall sem\\Java\\Guitar");
                fileName += "\\chords.txt";
                file = new File(fileName);

                if(file.exists())
                {
                int size = (int)file.length();
                double sizeKB = size/1024.0;

                System.out.println("Size of the file is : " + size + " Bytes");
                System.out.println("Size of the file is : " + sizeKB + "KB");

                fis = new FileInputStream(file);

                byte data[] = new byte[size];
                /*
                int ind = 0;
                byte b;

                while ((b = (byte)fis.read())!= -1)
                {
                    data[ind++] = b;
                }
                */
                fis.read(data);

                System.out.println("Contents of the file are : \n");

                for(byte k:data)
                {
                    System.out.print(k);
                }

                System.out.println("Reading part is over!");

                fileName = new String("chords.txt");

                file = new File(fileName);

                fos = new FileOutputStream(file);

                fos.write(data);

                System.out.println("Successfully Written to " + file.getAbsolutePath());

                }
                else
                {
                    System.out.println("No such file :" + file.getAbsolutePath());
                }
            }
            finally{
                fis.close();
                fos.close();
            }
        }
        public static void main(String[] args) 
        {
            try {
                new StreamDemo().StreamDemo();
            } catch (Exception e) {
                System.out.println("Exception in Main! " + e.getMessage());
            }
        }
}