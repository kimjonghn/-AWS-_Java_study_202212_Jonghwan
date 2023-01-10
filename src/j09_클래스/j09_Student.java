package j09_클래스;

public class j09_Student {

	String name = "홍";
	int age = 100;
	
	j09_Student() {//기본생성자
		System.out.println("생성됨~");
	}
	
	void printInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);

	}
}
//public 모든 폴더안에서 적용가능
//private class안에서만 
//default 패키지 안에서만