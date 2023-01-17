package j21_예외;

public class CustomErroException extends RuntimeException{
	
	public CustomErroException() {
		System.out.println("내가 만든 예외 생성");
	}
	public CustomErroException(String message) {
		super(message);
	}
		
}
