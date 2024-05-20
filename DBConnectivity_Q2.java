package task23;

import java.sql.*;
import java.util.Scanner;
public class DBConnectivity_Q2 {

	public static void main(String[] args) throws SQLException { 
		//establish the connection from java to database through driver
	   Connection dbConnection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "admin");
	  
	   Statement statement = dbConnection.createStatement(); 
	   
	   //create table and insert the values
	   statement.executeUpdate("create table EmployeeDetails (empcode int NOT NULL primary key, empname varchar(20), empage int, esalary int)");
	   statement.executeUpdate("Insert into EmployeeDetails values(101,'Jenny',25,10000),"
	   	+ "(102,'Jacky',30,20000),(103,'Joe',20,40000),(104,'John',40,80000),(105,'Shameer',25,90000)");
	  
	   /*Logic To insert the values from user input
	   Scanner scan = new Scanner(System.in);	   
	   for(int i=1; i <=5; i++) {
		  System.out.println("Enter values");
		  statement.executeUpdate("insert into EmployeeDetails values ("+scan.nextInt()+","+scan.next()+","+scan.nextInt()+","+scan.next()+")");
	  }*/
	   
	  ResultSet rs = statement.executeQuery("select * from EmployeeDetails"); //execute the SQL Query statement
	  
	  ResultSetMetaData metadata=rs.getMetaData();
	  for(int i=1;i<=metadata.getColumnCount();i++) {
		  System.out.print(metadata.getColumnLabel(i)+" "); //print the column name
	  }
	  
	  System.out.println("");
	  
	  //checks for the availability of next row and print the values of each column
	  while(rs.next()) {
		  System.out.println(rs.getInt(1)+ "    "+ rs.getString(2)+"    "+rs.getInt(3)+"    "+rs.getInt(4));
	 }
	   
	}

}
