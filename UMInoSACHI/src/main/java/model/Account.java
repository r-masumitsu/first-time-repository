package model;

public class Account {
	private String userId;
	private String pass;
	private String name;
	private String address;
	private boolean isAdmin;
	
	public Account(String userId, String pass, String name, String address, boolean isAdmin) {
		this.userId = userId;
		this.pass = pass;
		this.name = name;
		this.address = address;
		this.isAdmin = isAdmin;
	}

	public String getUserId() {
		return userId;
	}

	public String getPass() {
		return pass;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

}
