import java.sql.*;

class DBPIns 
{
    public static void main(String ar[]) throws Exception
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
        PreparedStatement   stmt =  con.prepareStatement("insert  into vit values(22,'Aditya')");
        stmt.executeUpdate();
        System.out.println("Row Created");con.close();
    }
}