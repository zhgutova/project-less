package less29;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.sqlite.JDBC;

public class Connect {
	
	final static String conn = "jdbc:sqlite:less29.db";
	
	public Connect() throws SQLException {
		DriverManager.registerDriver(new JDBC());
	}
	
	public static Connection getConnect() throws SQLException {
		return DriverManager.getConnection(conn);
		
	}
	/*
	public void openConn() throws SQLException {
		
	}
		
		public void closeConn() throws SQLException {
		
		
	}*/
	
	
	
	
	

}
