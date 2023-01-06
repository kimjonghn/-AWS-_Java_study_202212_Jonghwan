package j07_반복;

public class Continue {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			
			if(i % 2 != 0) { //i를 2로 나누어서 나머지가 0이 아니면 continue(다음 반복을) 해라
				continue;  //나머지가 0으로 떨어지면 continue가 실행이 안됨!
			}
			
			System.out.println("i: " + i);
		}
		
		
		int i = 0;
		
		while(i < 10) {
			if(i % 2 != 0) {
				i++;					//i++를 여기쓰는 이유는 무한 continue때문에 1씩증가가 되지않으므로 !!
				continue;
			}
			System.out.println("i: " + i);
			i++;			
			
		}
	}

}
