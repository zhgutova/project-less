package less29;

public class User {
	int id;
	String login;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public User(String login) {
		this.login = login;
	}
	
	public User() {
		
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", login=" + login + "]";
	}
	
	
}
