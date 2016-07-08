/**
 * Created by briandunne on 01/07/2016.
 */
//STEP 1. Import required packages

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertSQL {

static void executeInsertSQL(String ourReferenceNumber){
        Connection conn = null;
        PreparedStatement preparedStmt = null;
        try{
            //establish db connection
            conn = ConnectionFactory.createConnection();
            conn.setAutoCommit(false);
            String sql = "INSERT INTO deliveries (our_reference)  " +
                   "VALUES (?)" ;
            System.out.println("Inserting records into the table...");
            preparedStmt = conn.prepareStatement(sql);
            preparedStmt.setString(1, ourReferenceNumber);

            preparedStmt.executeUpdate();
            System.out.println("Inserted " + ourReferenceNumber + " into the table...");
            conn.commit();

        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(preparedStmt!=null)
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
