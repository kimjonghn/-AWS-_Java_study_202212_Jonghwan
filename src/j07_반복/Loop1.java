package j07_반복;

public class Loop1 {

	public static void main(String[] args) {
		
		int total = 0;
		for(int i = 0; i < 100; i++) {
			total += i + 1; 
		}
		
		System.out.println("총합: " + total);
		 // int i = 0 변수는 for문 안에 있기 때문에 for문 밖으로는 영향을 주지 않는다. 
		// i = 0은 고정
		// i < 10 => 10번을 반복한다는 뜻
		// System.out.println(i + 1); => 1부터 시작
		
		
	}

}
