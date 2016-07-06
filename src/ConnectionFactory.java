import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/goods_inwards";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "root";

    static Connection createConnection() {
        Connection conn = null;

        try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            //Open a connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
