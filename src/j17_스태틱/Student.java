package j17_스태틱;

public class Student {
	
	private static final int CODE = 20230000;
	
	private static int ai = 1; // auto_increment
	
	private int studentCode;
	private String name;
	
	public Student(String name) {
		studentCode = CODE + ai;
		ai++;
		this.name = name;
	}
	public static int getAutoIncrement() {
		int num = 0; // 지역 변수는 가능하다 
		System.out.println("현재 AI: " + ai);
//		System.out.println("학생이름: " + name); //name 객체가 생성이 된 후에 쓸수 있다.
		return ai;
	}
	
	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + ", name=" + name + "]";
	}
	
	
}
