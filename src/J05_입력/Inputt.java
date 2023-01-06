package J05_입력;

import java.util.Scanner;

public class Inputt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//입력받을수 있는 스캐너를 만든다. new:새로운 , System.in : 시스템 안으로 스캔한다
		int inputNum1 = 0;
		int inputNum2 = 0;
		int inputNum3 = 0;
		int inputNum4 = 0;
		int inputNum5 = 0;
		
		System.out.print("입력1: ");
		inputNum1 = scanner.nextInt(); //nextInt -> 정수만 입력가능
		System.out.print("입력2: ");
		inputNum2 = scanner.nextInt();
		System.out.print("입력3: ");
		inputNum3 = scanner.nextInt();
		System.out.print("입력4: ");
		inputNum4 = scanner.nextInt();
		System.out.print("입력5: ");
		inputNum5 = scanner.nextInt();
		System.out.println("입력값:"+ (inputNum1 + inputNum2 + inputNum3 + inputNum4 + inputNum5));
		
		//ctrl + shift + O -> infut 단축키
		//----------------------------------------------------------------------------------------------------
		
		Scanner scanner2 = new Scanner(System.in);
		
		System.out.print("숫자: ");
		int Number = scanner2.nextInt();
		System.out.print("숫자: ");
		int Number1 = scanner2.nextInt();
		System.out.print("숫자: ");
		int Number2 = scanner2.nextInt();
		
		System.out.print("결과: " + (Number + Number1 + Number2));
		
		
		
		
		
	}

}
