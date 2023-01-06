package j09_클래스;
//메인 메소드
public class j09_StudentMain {
	
	public static void main(String[] args) {
		
		j09_Student student1 = new j09_Student();
		j09_Student student2 = new j09_Student();
		//j09_Student = 자료형 ////  student1 = 변수명 //// new j09_Student() = 값
		// j09_Student(); == > 생성자  생성자를 생성하려면 앞에 무조건 new를 붙여야 됨 
		// 생성자는 class명과 일치할수가 없다 형태는 메소드 형태 
		System.out.println(student1);
		System.out.println(student2);
		
		
		
		j09_Student s1 = new j09_Student();
		j09_Student s2 = new j09_Student();
		
		s1.name = "홍길동";
		s1.age = 25;
		
		s1.printInfo();
		
		s2.printInfo();
	}

}
