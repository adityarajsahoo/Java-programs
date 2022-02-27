// to make our machine as a web server we use tomcat

import java.sql.*;

public class JDBCDemo
{
    public void doConnection()
    {
        try {
            /*
            // Register Driver

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            // Get a connection

            String url = "jdbc:odbc:dsnOracle";
            String userId = "system";
            String password = "manager";

            Connection connection = DriverManager.getConnection(url, userId, password);
            */
            
            //Establish Connection

            OracleDataSource ods = new OracleDataSource();
            String ip = "//192.168.1.3";
            String port = "1521";
            String sid = "xe";
            String url = "jdbc:oracle:thin:@" + ip + ":" + port + "/" + sid;
            String userId = "system";
            String password = "manager";
            ods.setURL(url);
            ods.setUser(userId);
            ods.setPassword(password);
            Statement statement = ods.getConnection();

            // Create a statement

            Statement statement = connection.createStatement();

            // Execute a Query

            String query = "select * from emp";
            ResultSet rs = statement.executeQuery(query);

            while(rs.next())
            {
                System.out.println(rs.getInt(1));
            }

        } catch (SQLException se) {
            System.out.println(se);
        }

        public static void main(String[] args) {
            new JDBCDemo().doConnection();
        }
    }
}