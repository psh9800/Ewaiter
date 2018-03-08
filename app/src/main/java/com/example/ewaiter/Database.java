package eWaiter;

import java.sql.*;


public class Database {
	
	public static String tableName1 = "Restaurant";
	public static String tableName2 = "ActiveTables";
	public static String tableName3 = "Staff";

	public static String url = "jdbc:sqlite:ewaiterdb.db";
	
	
	public static void createNewDatabase(String fileName) {
		
		String url = "jdbc:sqlite:ewaiterdb.db";
		
		try (Connection conn = DriverManager.getConnection(url)){
			if(conn != null) {
				DatabaseMetaData meta = conn.getMetaData();
				System.out.println("The driver name is " + meta.getDriverName());
				System.out.println("A new database has been created.");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) throws SQLException {
		createNewDatabase("ewaiterdb.db");
		makeNewRestaurantTable(tableName1);
		makeNewStaffTable(tableName3);
		makeNewTableTable(tableName2);
	}
	
	
	
	public static void makeNewRestaurantTable(String tableName  ) throws SQLException {
		
		Connection conn = DriverManager.getConnection(url);
		
		
		String tableCommand = "CREATE TABLE IF NOT EXISTS " + tableName +
				" (restaurantID INTEGER PRIMARY KEY, restaurantAddress TEXT, phoneNumber TEXT );" ;
		
		Statement statement = conn.createStatement();
		statement.executeUpdate(tableCommand);
		statement.close();
		conn.close();
			
		
	}

	public static void makeNewStaffTable(String tableName  ) throws SQLException {
		
		Connection conn = DriverManager.getConnection(url);
		
		
		String tableCommand = "CREATE TABLE IF NOT EXISTS " + tableName +
				" (staffID INTEGER PRIMARY KEY, restuarantID INTEGER, "
				+ "staffType TEXT, clockInTime DATETIME, currentSection INTEGER, "
				+ "orderNumber INTEGER, totalSales FLOAT, totalTips FLOAT, "
				+ "FOREIGN KEY (restuarantID) REFERENCES Restaurant (restuarantID) ); " ;
		
		Statement statement = conn.createStatement();
		statement.executeUpdate(tableCommand);
		statement.close();
		conn.close();
			
		
	}
	
	public static void makeNewTableTable(String tableName  ) throws SQLException {
		
		Connection conn = DriverManager.getConnection(url);
		
		
		String tableCommand = "CREATE TABLE IF NOT EXISTS " + tableName +
				" (tableID INTEGER PRIMARY KEY, restuarantID INTEGER, "
				+ "staffID INTEGER, "
				+ "maxGuests INTEGER, currentGuests INTEGER, sectionID INTEGER, " 
				+ "FOREIGN KEY (staffID) REFERENCES Staff(staffID), "
				+ "FOREIGN KEY (restuarantID) REFERENCES Restaurant (restuarantID) ); ";
		
		Statement statement = conn.createStatement();
		statement.executeUpdate(tableCommand);
		statement.close();
		conn.close();
			
		
	}
}


