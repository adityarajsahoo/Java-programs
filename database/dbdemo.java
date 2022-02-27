import java.sql.*;
class dbcontest 
{

    public static void main(String ar[]) throws Exception
    {
          Class.forName("oracle.jdbc.driver.OracleDriver");


           Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");


           System.out.println("Database Connected");
    }
}

