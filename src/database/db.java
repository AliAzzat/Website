package database;
import java.sql.*;
public class db {
	
	
private static Connection connection;
private static Statement statement;
private static ResultSet resultSet;


  public static void startConnection() {

 String javaDriver = "com.mysql.cj.jdbc.Driver";
  String jdbcURLRemoteHost = "jdbc:mysql://localhost:3306/courses";
  String root = "root";
	 String myPassword="ali1989119";
	  ResultSet rs;
		  try
				    {
	   Class.forName(javaDriver);
				
	 connection = DriverManager.getConnection(jdbcURLRemoteHost,root,myPassword);
				    }
	 catch( Exception e )
				    {
	      System.out.println("error1: "+e.getLocalizedMessage());
				    }
				}
	public static void dataInsert()
				{
		try
			      {
		     startConnection();
		     String name = "Alkailany";
	       String sqlStatement = String.format("insert into student_table values('%d','%s','%s','%d','%s')",8, "aska", "Ali", 2017, "baghdad");
	        statement = connection.createStatement();
	       statement.executeUpdate(sqlStatement);
			           
  // if you want to give something you have to give executeUpdate()
  // if you want to take something from database you have to give executeQuery()
 }
	 catch (SQLException e) 
 {
   System.out.println("error5: "+e.getLocalizedMessage()); 
  }
	}
	public static void main(String args[])
	{
	dataInsert();
	}
					
			


		



	

}
