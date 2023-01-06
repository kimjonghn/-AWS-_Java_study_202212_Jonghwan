package J05_입력;

import java.util.Scanner;

public class Inputt3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str1 = null;
		int Number1 = 0;
		String str2 = null;
		String str3 = null;
		
		System.out.print("이름: ");
		str1 = scanner.next(); //next는 스페이스바와 엔터를 무시한다.
		
		System.out.print("나이: ");
		Number1 = scanner.nextInt();
		scanner.nextLine(); // next 다음에 next line을 만나게 되면 엔터 동작과 동시에 넘어가게 되므로 중간에 nextLine 을 만들어 준다.
		
		
		System.out.print("주소: ");
		str2 = scanner.nextLine();
		
		System.out.print("연락처: ");
		str3 = scanner.next();
		
		
		
		System.out.println("사용자의 이름은 " + str1 + "이고 나이는" + Number1 + "입니다.");
		System.out.println("주소는" + str2 + "에 거주중입니다");
		System.out.println("연락처는" + str3 + "입니다");
		
		
	}

}
