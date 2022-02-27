import java.io.*;
public class ExerciseImpl extends Exercise 
{
    public void runExercise( String[] argv ) throws Exception 
    {
        System.out.println( "<pre>" );
        System.out.println( this.getStringFromFile(
       this.getPath()+"/myfile.txt" ) );
        System.out.println( "</pre>" );
    }
    public String getStringFromFile( String path ) throws Exception 
    {
        File file = new File(this.getPatch() + "/myfile.txt"); 
  
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        
        String st; 
        while ((st = br.readLine()) != null) 
        System.out.println(st);
    }
}
