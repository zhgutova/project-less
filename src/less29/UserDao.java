package less29;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.sqlite.JDBC;

import less8_DB.Book;

public class UserDao implements Dao{
	
	User user;
	Connect conn;
	
	
	
	public UserDao(Connect conn) {
		this.conn = conn;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	String update = "UPDATE User SET id=?, login=? WHERE id=?;";
	String delete = "DELETE FROM User WHERE id=?;";
	
	public static void createTable() throws SQLException {
		String sql = "CREATE TABLE IF NOT EXISTS User (" + 
				"id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
				"login TEXT NOT NULL);";
		
		
		try (Connection connection = Connect.getConnect()) 
		{ 
			Statement statement = connection.createStatement();
			int row = statement.executeUpdate(sql); 
			System.out.println(row);
			}
			
		}

	@Override
	public void add(){
		String insert = "INSERT INTO User (login) VALUES (?);";
		
		try (Connection connection = Connect.getConnect()) { 
					PreparedStatement statement = connection.prepareStatement(insert);
						statement.setString(1, user.getLogin());
						int row = statement.executeUpdate();
						System.out.println(row);
					}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void getAll(){
		String getAll = "SELECT * FROM User;";
		
		try (Connection connection = Connect.getConnect()) { 
					Statement statement = connection.createStatement();
					ResultSet res = statement.executeQuery(getAll); 
					while (res.next()) {
						String str = res.getString("login"); 
						int id = res.getInt("id");
						System.out.print("id = " + id);
						System.out.print(" login = " + str);
						System.out.println();
					}
					
					}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	//@Override
	public void getById(int id) {
		String getById = "SELECT * FROM User WHERE id=?;";
		
		try (Connection connection = Connect.getConnect()) { 
					PreparedStatement statement = connection.prepareStatement(getById);
					statement.setInt(1, id);
					ResultSet res = statement.executeQuery(); 
					User user = new User();
					while (res.next()) {
						user.setLogin(res.getString("login"));
						user.setId(res.getInt("id"));
					}
					System.out.println(user.toString());
					}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}





	
}
