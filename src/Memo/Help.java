package Memo;

import java.util.Scanner;

public class Help {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean loopFlag1 = true;
		
		while(loopFlag1) {
			char select = '\0';
			
			System.out.println("========<<식당>>========");

			System.out.println("1. 김밥천국");

			System.out.println("2. 탄탄면");

			System.out.println("3. 홍대개미");

			System.out.println("4. 밥앤밥");

			System.out.println("================");

			System.out.println("q. 프로그램 종료");

			System.out.println("================");

			System.out.print("식당번호 선택: ");
			
			select = scanner.next().charAt(0);
			
			if(select == 'q' || select == 'Q') {
				loopFlag1 = false;
			}else if(select == '1') {
				boolean loopFlag2 = true;
				
				while(loopFlag2) {
				System.out.println("========<<메뉴>>========");

				System.out.println("1. 라면");

				System.out.println("2. 돈까스");

				System.out.println("3. 김밥");

				System.out.println("4. 떡국");

				System.out.println("================");

				System.out.println("q. 프로그램 종료");

				System.out.println("================");

				System.out.print("메뉴번호 선택: ");
				select = scanner.next().charAt(0);
				}
			}
		}
		
		
		
		
		
		
	}

}
