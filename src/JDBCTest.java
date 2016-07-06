/**
 * Created by briandunne on 01/07/2016.
 */
//STEP 1. Import required packages
import java.sql.*;

public class JDBCTest {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            //Register JDBC driver
            ConnectionFactory cf = new ConnectionFactory();
            conn = cf.createConnection();

            //Execute a query
            // TODO create DAO object to handle queries
            System.out.println("Inserting records into the table...");
            stmt = conn.createStatement();

            String sql = "INSERT INTO deliveries (our_reference, intended_recipient) " +
                    "VALUES (051316, 'John Smith')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO deliveries (our_reference, intended_recipient) " +
                    "VALUES (051416, 'Fergal Butler')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO deliveries (our_reference, intended_recipient) " +
                    "VALUES (051516, 'Rick Slick')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO deliveries (our_reference, intended_recipient) " +
                    "VALUES(051616, 'Kitty Burke')";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");

        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    conn.close();
            }catch(SQLException se){
            }// do nothing
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main
}//end JDBCExample
