package J10_생성자;

public class J10_Student {
//생성자도 오버로딩이 된다
	String name;
	int age;
	//참조변수 , 레퍼런스 변수, 멤버변수
	
	J10_Student() {						
		System.out.println("기본 생성자 호출");
	}
	
	J10_Student(int age) {
		System.out.println("학생의 나이: " + age);
	}
	
	J10_Student(String name) {
		System.out.println("학생의 이름: " + name);
	}
	
	J10_Student(String name, int age) {
		this.name = name;
		this.age = age;
		//this = > 자신의 주소
	}
	//멤버변수를 가지고 것을 입력
	void printInfo() {
		System.out.println("학생 이름: " + name);
		System.out.println("학생 나이: " + age);
	}

}
//접근지정자
/*
 * public
 * 
 * ex) public String name;
 * ex) public J10_Student(){}
 * */
 