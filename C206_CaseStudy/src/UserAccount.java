

public class UserAccount {
	private String name;
	private String role;
	private String email;
	private String password;
	private String status;
	
	public UserAccount(String name, String role, String email, String password, String status) {
		this.name = name;
		this.role = role;
		this.email = email;
		this.password = password;
		this.status = "Confirmed";
	} 


	public String getName() {
		return name;
	}


	public String getRole() {
		return role;
	}



	public String getEmail() {
		return email;
	}



	public void getPassword(String password) {
		this.password = password;
	}


	public String getStatus() {
		return status;
	}
	
	public String setStatus() {
		return status;
	}


}
