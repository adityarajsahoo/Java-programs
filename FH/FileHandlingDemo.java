import java.io.File;

class FileHandlingDemo
{
    public static void main(String[] args) 
    {
        String url = "C:\\Fall sem\\Java";
        File file = new File(url);

        System.out.println("List of files and directories in"+url+" :: ");

        String list[] = file.list();

        for (String str:list)
        {
            System.out.println(str);
        }

        String newDir = "tokyo ghoul";

        // concatenate the newDir to url.

        url = url + "/" + newDir;
        file = new File(url);

        boolean exists = file.exists();

        if(!exists)
        {
            if(file.mkdir())
                System.out.println("Directory creation is successful");
            else
                System.out.println("Not possible to create such a directory!");
        }
        else
        {
            System.out.println("Directory already exsists!");
        }
        
        String list1[] = file.list();

        System.out.println("After Creating the directory :");

        for(String str:list1)
        {
            System.out.println(str);
        }
    }

}