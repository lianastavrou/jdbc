package jdbc;

import java.sql.*; 

public class Driver {

	public static void main(String[] args) {
		
	
		try {
			 
			Connection myConn = DriverManager.getConnection 
					("jdbc:mysql://localhost:3306/company", "root", "6973998543bobi");
			
			Statement myStmt = myConn.createStatement ();
			
			ResultSet myRs = myStmt.executeQuery("select * from employees");
			
			while (myRs.next()) {
				
				System.out.println(myRs.getString("last_name") + "," + myRs.getString("afm"));
				
				
			}
		}
			
		catch (Exception exc)	{
			
			exc.printStackTrace();
			
		   }
	
		}
   


	}
 

