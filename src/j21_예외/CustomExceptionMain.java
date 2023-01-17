package j21_예외;

public class CustomExceptionMain {
	public static void main(String[] args) {
	
		try {
		throw new CustomErroException("뭔가 문제가 있음");//생성자 오버로딩을 안해서 예외가 생성이 안됨
//		throw new IndexOutOfBoundsException("인덱스를 초과함");
		}catch (CustomErroException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
		
		System.out.println("프로그램 종료");
	}
}
