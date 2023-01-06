package J03_형변환;

public class Casting2 {

	public static void main(String[] args) {
		char char_a = 'a';
		int num = char_a; //char -> int (업캐스팅)
		
		
		char char_b = (char)(num+1);//다운 캐스팅  ,+ 보다 형변환이 우선순위가 높다
		System.out.println(char_b);
		
	}

}
