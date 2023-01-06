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
