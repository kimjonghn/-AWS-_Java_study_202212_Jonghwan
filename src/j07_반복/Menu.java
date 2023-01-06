package j07_반복;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		Stirng name = "홍길동";
//		System.out.println(name.charAt(0));
		
		boolean loopFlag1 = true; //boolean = true false (설정)
		
		while(loopFlag1) {
			char select = '\0'; // cahr a = '\0' : 한단어만 입력 \0(공백)
			
			System.out.println("========<<메뉴>>========");
			System.out.println("1. 김밥천국");
			System.out.println("2. 탄탄면");
			System.out.println("3. 홍대개미");
			System.out.println("4. 밥앤밥");
			System.out.println("================");
			System.out.println("q. 프로그램 종료");
			System.out.println("================");
			
			System.out.print("식당 번호 선택: ");
			
			select = scanner.next().charAt(0); //
			
			if(select == 'q' || select == 'Q') {
				loopFlag1 = false;
			}else if (select == '1') {
				boolean loopFlag2 = true;
				
				while(loopFlag2) {
					System.out.println();
					System.out.println("========<<김밥천국>>========");
					System.out.println("1. 라면");
					System.out.println("2. 돌솥비빔밥");
					System.out.println("3. 오므라이스");
					System.out.println("4. 김치볶음밥");
					System.out.println("================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("================");
				
					System.out.print("메뉴 번호 선택:  ");				
					select = scanner.next().charAt(0);
				
					if(select == 'b') {
						loopFlag2 = false;
					}else if(select == 'q' || select == 'Q') {
						loopFlag1 = false;
						loopFlag2 = false;
					}else if(select == '1') {
						System.out.println("라면을 선택했습니다.");
					}else if(select == '2') {
						System.out.println("돌솥비빔밥을 선택했습니다.");
					}else if(select == '3') {
						System.out.println("오므라이스를 선택했습니다.");
					}else {
						System.out.println();
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("사용할 수 없는 번호입니다.");
						System.out.println("다시 입력하세요.");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					}
					System.out.println();
				}
				
			}else if (select == '2') {
				boolean loopFlag3 = true;
				
				while(loopFlag3) {
					System.out.println();
					System.out.println("========<<탄탄면>>========");
					System.out.println("1. 라면");
					System.out.println("2. 쫄면");
					System.out.println("3. 짜장면");
					System.out.println("4. 짬뽕");
					System.out.println("================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("================");
				
					System.out.print("메뉴 번호 선택:  ");
					select = scanner.next().charAt(0);
					
					if(select == 'b') {
						loopFlag3 = false;
					}else if(select == 'q' || select == 'Q') {
						loopFlag1 = false;						
						loopFlag3 = false;
					}else if(select == '1') {
						System.out.println("라면을 선택했습니다");
					}else if(select == '2') {
						System.out.println("쫄면을 선택했습니다.");
					}else if(select == '3') {
						System.out.println("짜장면을 선택했습니다.");
					}else {
						System.out.println();
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("사용할 수 없는 번호입니다.");
						System.out.println("다시 입력하세요.");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					}
					System.out.println();
				}
				
			}else if (select == '3') {
				
			}else if (select == '4') {
				
			}else {
				System.out.println();
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				System.out.println("사용할 수 없는 번호입니다.");
				System.out.println("다시 입력하세요.");
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			}
			
			
			System.out.println();
		}
		System.out.println("프로그램 정상 종료!");
	}

}
