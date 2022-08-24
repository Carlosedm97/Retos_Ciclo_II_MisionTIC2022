package app;
import java.sql.Connection;
import java.sql.DriverManager;
public class Conexion {
    public static Connection getConnection(){
        String dburl = "jdbc:mysql://localhost:3306/uber";
        String user = "root";
        String pass = "0112";
        
        try {
            Connection conn = DriverManager.getConnection(dburl, user, pass);
            return conn;
        } catch (Exception e) {
            System.out.println("No se conecto");
            System.out.println(e.toString());
            return null;
        }
    }
}
// Andrea Pinzon
// Carlos Antonio Meza