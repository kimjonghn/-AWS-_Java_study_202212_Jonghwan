package J11_접근지정자;

import J11_접근지정자.default1.J11_StudentDefault;

public class J11_StudenMain {

	public static void main(String[] args) {
		
//		J11_Student s1 = new J11_Student();
//			s1.name = "홍길동";
					
//			s1.printInfo();
					
		J11_StudentDefault s2 = new J11_StudentDefault();
		
//		s2.name = "홍길동";
//		
//		System.out.println("이름: " + s2.name);
		System.out.println("이름: " + s2.getName());
		

	}

}
