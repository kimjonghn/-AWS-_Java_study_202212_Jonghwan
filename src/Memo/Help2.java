package Memo;

public class Help2 {

	public static void main(String[] args) {
		//0 2 4 6 8
		for(int i = 0; i < 10; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println("i: " + i);
			System.out.println();
		}
		
		
		
		int i = 0;
		while(i < 10) {			
			if(i % 2 != 0) {//나머지가 0이 안되면 실행이 된다.
				i++;		//나머지가 0이 안되면 실행이 되고 i++의 영향을 받는다	
				continue; //나머지가 0으로 떨어지면 실행이 안됨
			}
			System.out.println("i: " + i);
			i++;
		}
		
		
		
	}

}
