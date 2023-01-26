package j20_Json.builder;

import lombok.Builder;
import lombok.Data;

@Builder
@Data // AllArgsconstructor포함된다.
//@AllArgsConstructor
public class User {
	private int userId;
	private String username;
	private String password;
	private String name;
	private String email;
	
//	public static UserBuilder builder() {
//		return new UserBuilder();
//	}
//	
//	@Data
//	public static class UserBuilder{///static을 쓰는이유는
//		private String username;
//		private String password;
//		private String name;
//		private String email;
//		
//		public UserBuilder username(String username) {
//			this.username = username;
//			return this; //this를 리턴??
//		}
//		public UserBuilder password(String password) {
//			this.password = password;
//			return this; //this를 리턴??
//		}
//		public UserBuilder name(String name) {
//			this.name = name;
//			return this; //this를 리턴??
//		}
//		public UserBuilder email(String email) {
//			this.email = email;
//			return this; //this를 리턴??
//		}
//		
//		public User build() {
//			return new User(username, password, name, email);
//		}
//		
//	}
}
