package j07_반복;

import java.util.Scanner;

public class Loop3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;
		int total = 0;
		
		System.out.print("반복횟수: ");
		count = scanner.nextInt();
		System.out.println(); //줄바꿈
		
		for(int i = 0; i < count; i++) {
			int a = 0;
			int b = 0;
		System.out.println(i + 1 + "번 반복");
		System.out.print("a: ");
		a = scanner.nextInt();
		System.out.print("b: ");
		b = scanner.nextInt();
		
		total += a + b;
		//total = total + a + b
		System.out.println(i + 1 + "번 합: " + (a + b));
		System.out.println(); //줄바꿈
		}
		
		System.out.println("총합: " + total);
	}
}
