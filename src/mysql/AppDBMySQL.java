package mysql;

import java.sql.*;

public class AppDBMySQL {

    public static void main(String[] args) throws Exception{

        String DB_URL = "jdbc:mysql://localhost:3306/emp?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String USUAR = "cubap";
        String CONTR = "";

        Connection c = DriverManager.getConnection(DB_URL,USUAR,CONTR);
        
        Statement s = c.createStatement();
        String sql = "SELECT * FROM empleado";
        ResultSet r = s.executeQuery(sql);
        
        r.next();
        System.out.println(""+r.getInt(1) + " " + r.getString(2));
        
        r.close();
        s.close();
        c.close();
        
    }
}
