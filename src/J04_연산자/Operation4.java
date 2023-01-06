package J04_연산자;

public class Operation4 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		int result = num1 > num2 ? num1 * -1 : num2 * -1; //결과가 참이면은 (num1 * -1)결과값이 출력된다 거짓이면 반대로 출력된다.
		
		System.out.println(result);
		
		int num = 79;
		
		int result2 = num / 90 ==1 ? 90 
					: num /80 ==1 ? 80 
					: num / 70 == 1 ? 70 
					: 0;
		//num을 90으로 나누었을때 0이 나옴 (num / 90 ==1)참이 아니면은 ( num /80 ==1)이것도 참이 아니므로 (num / 70 == 1)이것은 참이므로 70이 출력됨

		System.out.println(result2);
		
		

	}

}
