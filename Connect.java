import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {

    private static Connection con;
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/medical","root","");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection()
    {
        return con;
    }
        
}
