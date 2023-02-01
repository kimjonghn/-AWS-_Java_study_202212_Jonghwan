package j24.람다;

public class Lambda1 {
	public static void main(String[] args) { //람다를 쓰는 목적 : 1.간결해 진다, 2.변수를 쓸수있다, 3.익명클래스와 동일
		
//		Instrument instrument = new Instrument() {
//
//			@Override
//			public String play(String instrument) {				
//				return instrument + "를 연주합니다.";
//			}
//			
//		};
		
		Instrument instrument2 = (String itm) -> {//람다 정의와 생성을 동시에 한다.
			return itm + "을(를) 연주합니다.";
		};
		
		//매개변수의 자료형을 생략할 수 있다.(String)
		//매개변수의 이름을 바꿀 수 있다.
		Instrument instrument3 = (itm) -> {
			return itm + "을(를) 연주합니다.";
		};
		
		//매개변수가 하나이면 매개변수를 감싸는 괄호를 생략할 수 있다.
		Instrument instrument4 = itm -> {
			return itm + "을(를) 연주합니다.";
		};
		
		//구현부의 명령이 하나일 때 중괄호를 생략할 수 있다.
		//이때 리턴자료형이 정해져 있으면 리턴값으로 사용이 된다.(중괄호를 생략을 했으면 리턴을 무조건 생략을 해줘야한다.)
		Instrument instrument5 = itm -> itm + "을(를) 연주합니다.";
		
		int result = 10 + 20;
		
		Instrument instrument6 = itm -> itm + "을(를) 연주합니다." + result;
		
		
		System.out.println(instrument2.play("피아노"));
		
		String drum = instrument2.play("드럼");
		System.out.println(drum);
		
		System.out.println(instrument6.play("기타"));
		
	}
}
