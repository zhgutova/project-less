package less29;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		UserDao ud = new UserDao(new Connect());
		//ud.setUser(new User("log1"));
		//ud.setUser(new User("log2"));
		
		//UserDao.createTable(); //0
		//ud.add();//1
		ud.getAll();
		ud.getById(1);
		
		/*
id = 0 login = log1
id = 1 login = log2
User [id=1, login=log2]
		 */

	}

}
