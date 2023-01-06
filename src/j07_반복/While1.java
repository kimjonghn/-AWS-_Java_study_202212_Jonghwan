package j07_반복;

public class While1 {

	public static void main(String[] args) {
		
		//index: 순서가 있는 경우에 쓰임(for문)
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("============");
		
		// 순서보다 조건이 중요할 때(while문)
		int i = 0;
		
		while (i < 10) {
			System.out.println(i);
			
			i++;
		}
		

	}
}
