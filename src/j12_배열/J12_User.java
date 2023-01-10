package j12_배열;

public class J12_User {

	private String Username; //사용자 이름(아이디, 계정)
	private String password; //비밀번호
	private String name; 	 //성명
	private String email; 	 //이메일
	
	public J12_User() {	//ctr + space + s
		
		//alt + shift +s
		
	}

	public J12_User(String username, String password, String name, String email) {
		super();
		this.Username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		
		
		
	}

	

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "j12_User [Username=" + Username + ", password=" + password + ", name=" + name + ", email=" + email
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
