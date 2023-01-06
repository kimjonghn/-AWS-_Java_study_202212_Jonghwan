package J06_조건;

public class Conditional2 {

	public static void main(String[] args) {
		
		int num = 12;
		int num2 = 10;
		
		if(num > num2) {
			System.out.println("num이 num2보다 큽니다.");
			System.out.println("num: " + num);}
		else if(num==num2) {
				System.out.println("num과 num2가 같습니다.");
			}
			else {
				System.out.println("num이 num2보다 작습니다.");
			}
		

		
//		if(조건식1) 실행문; --조건식1이 true일 경우
//		else(조건식2) 실행문; --조건식1이 false일 경우 조건식2가 true 일때실행
//		else 실행문; --조건식1과2가 false일 경우 실행
	}

}
