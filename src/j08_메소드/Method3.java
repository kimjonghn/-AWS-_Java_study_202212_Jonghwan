package j08_메소드;

public class Method3 {
	//메소드의 오버로딩(오버로드)
	//이름이 같아도 괄호 안에 int...String을 넣어주면 같은 이름을 쓸수 있음
	//오버로딩 : 부를때 달라지는것
	//오버 라이드 : 덮어 쓰는것
	//void에 int를 넣고 이름이 같아도 쓸수가 없음!
	public static void ov1() {
		System.out.println("매개변수 없음");
	}	
	public static void ov1(int a) {
		System.out.println("int 매개변수 하나");
	}
	public static void ov1(int a, String b) {
		System.out.println("int 먼저 그다음 String");
	}
	public static void ov1(String a, int b) {
		System.out.println("String 먼저 그다음 int");
	}
	
	public static void main(String[] args) {
		ov1();
		ov1(10);
		
	}

}
