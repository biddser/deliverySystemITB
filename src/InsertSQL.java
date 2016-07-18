/**
 * Created by briandunne on 01/07/2016.
 */
//STEP 1. Import required packages

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertSQL {

static void executeInsertSQL(String ourReferenceNumber, String suppliersName, String suppliersReference, String intendedRecipient, int ourPoNumber, String processedBy){
        Connection conn = null;
        PreparedStatement preparedStmt = null;
        try{
            //establish db connection
            conn = ConnectionFactory.createConnection();
            conn.setAutoCommit(false);
            String sql = "INSERT INTO deliveries (our_reference, intended_recipient, suppliers_name, suppliers_reference, our_PO_number, processed_by)  " +
                   "VALUES (?, ?, ?, ?, ?, ?)" ;
            System.out.println("Inserting records into the table...");
            preparedStmt = conn.prepareStatement(sql);
            preparedStmt.setString(1, ourReferenceNumber);
            preparedStmt.setString(2, intendedRecipient);
            preparedStmt.setString(3, suppliersName);
            preparedStmt.setString(4, suppliersReference);
            preparedStmt.setInt(5, ourPoNumber);
            preparedStmt.setString(6, processedBy);


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
