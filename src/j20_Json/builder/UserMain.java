package j20_Json.builder;

public class UserMain {
	public static void main(String[] args) {
//		User user = new User(null, null, null, null);
		
		User.UserBuilder userBuilder = new User.UserBuilder();
		
		
		User user2 = User.builder()
				.username("aaa")
				.password("1234")
				.name("홍길동")
				.build();
		
		System.out.println(user2);
	}
}
