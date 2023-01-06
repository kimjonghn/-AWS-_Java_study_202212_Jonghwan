package j09_클래스;

public class J09_User {
	
		String name;
		String  username;
		int  password;
		String Email ;
		
		
		void printInfo() {
			name = "김종환";
			username = "aaa";
			password = 1234;
			Email = "aaa@gamil.com";
			
			System.out.println("아이디: " + username);
			System.out.println("비밀번호: " + password);
			System.out.println("이름: " + name);
			System.out.println("이메일: " + Email);
						
		}	

}
