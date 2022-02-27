import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;

class CharStreamDemo
{
    private File file;
    private String fileName;
    private FileReader reader;
    private FileWriter writer;

    public void StreamDemo() throws IOException, FileNotFoundException
    {
        try 
        {
            fileName = new String("C:chords.txt");
            file = new File(fileName);

            if(!file.exists())
            {
                System.out.println("No such file exists with the name : " + file.getName());
            }
            else
            {
                char data[] = new char[(int)file.length()];
                reader = new FileReader(file);

                reader.read(data);

                for(char c:data)
                {
                    System.out.print(c);
                }
                System.out.println("\n");

                fileName = new String("C:chords.txt");
                file = new  File(fileName);

                writer = new FileWriter(file);

                writer.write(data);

                System.out.println("Write-up is done");
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Exception in StreamDemo!" + e.getMessage());
        }
        finally
        {
            reader.close();
            writer.close();
        }
        }
        public static void main(String[] args) 
        {
            try 
            {
                new CharStreamDemo().StreamDemo();
            } catch (Exception e) 
            {
                System.out.println("Exception in Main Method!" + e.getMessage());
            }

    }
}