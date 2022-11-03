package sqlserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AppDBSQLServer {
    public static void main(String[] args) throws Exception{

        String DB_URL = "jdbc:sqlserver://localhost:1433;DatabaseName=musica;encrypt=true;trustServerCertificate=true;";
        String USUAR = "usersql";
        String CONTR = "root2";

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
