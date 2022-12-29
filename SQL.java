package TestSql;

import java.util.*;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.Statement;
import java.sql.*;

public class SQL {
	public static boolean createNewTable() {
		String url = "jdbc:mysql://localhost:3306/my_database";
		String user = "sa";
		String pass = "root";
		String sqlDB = "CREATE TABLE Students "+
		"(id INTEGER not NULL, "
				+ " fname VARCHAR(8), "
				+ " lname VARCHAR(8), "
				+ " birthdate date, " +
				" PRIMARY KEY ( id ))";
		java.sql.Connection conn = null;
		try {
			Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url, user, pass);
			java.sql.Statement st = conn.createStatement();
			int m = st.executeUpdate(sqlDB);
			if (m >= 1) {
				System.out.println("Created table in given database...");
				return true;
			} else {
				System.out.println(" table already Created in given database...");
			}
			conn.close();
		}
		catch (Exception ex) {
			System.err.println(ex);
		}
		return false;
	}
	
	public static boolean createSecTable() {
		String url = "jdbc:jdbc:mysql://localhost:3306/my_database";
		String user = "sa";
		String pass = "root";
		String sql = "CREATE TABLE Subjects "+
				"(id INTEGER not NULL, "
				+" title VARCHAR(8), "
				+ " descc VARCHAR(250), "
				+ " pricePerStudent  decimal)";
		java.sql.Connection conn = null;
		try {
			Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url, user, pass);
			java.sql.Statement st = conn.createStatement();
			int m = st.executeUpdate(sql);
			if (m >= 1) {
				System.out.println("Created table in given database...");
				return true;
			} else {
				System.out.println(" table already Created in given database...");
			}
			conn.close();
		}
		catch (Exception ex) {
			System.err.println(ex);
		}
		return false;
	}

	public static void main(String[] args) {
		createNewTable();
		createSecTable();
		/*
		 * String url = "jdbc:mysql://localhost:3306/my_database";
		 * 
		 * String user = "root"; String pass = "root";
		 */
	  
	
		
		//boolean menue = true;
		//boolean users = true;
		Scanner sa = new Scanner(System.in);
		
		do{
			System.out.println("1.List Top 100 Students");
			System.out.println("2.List Top 50 Subjects");
			System.out.println("3.Add a new Student");
			System.out.println("4.Add a new Subject");
			System.out.println("5.Load 1000000 student in Students Table");
			System.out.println("6. Load 100000 subjects in Subjects Table");
			System.out.println("7.Exit App");

			String bb = sa.next();
			int option = Integer.parseInt(bb);
			//Random random;
			switch (option) {

			case 1:
				
				createNewTable();
				System.out.println("List Top 100 Students");
				
				break;

			case 2:
				createSecTable();
				System.out.println("List Top 50 Subjects");
				
							break;

				

			case 3:


				
				
				break;

            case 4:


				
				
				break;
				
             case 5:


				
				
				break;
				
             case 6:


 				
 				
 				break;
 				
             case 7:


 				
 				
 				break;
 				
				
			}
			
		
	}while(true);

	}

}
