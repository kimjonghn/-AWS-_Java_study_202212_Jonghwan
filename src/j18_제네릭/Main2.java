package j18_제네릭;

public class Main2 {
	
	//? 와일드 카드 제약
	//extends 대상 객체 하위 
	//super 대상 객체 상위
	//super = 자기자신과 상위계체만 가능하다 
	public CMRespDto<?> response(CMRespDto<?> cmRespDto) {//    ? = > 와일드 카드
		System.out.println("[응답데이터]");
		System.out.println(cmRespDto);
		return cmRespDto;
	}
	
	public static void main(String[] args) {
		
		Main2 main = new Main2(); //Main클래스가 생성이 되어야지만 response메소드를 호출 가능하다
		
		CMRespDto<String> hello 
		= new CMRespDto<String>(200, "성공", "안녕하세요");
		
		CMRespDto<Integer> score
			= new CMRespDto<Integer>(200, "성공", 85);
		
		System.out.println("hello");
		System.out.println(main.response(hello));		
		
		System.out.println("score");
		System.out.println(main.response(score));
		//안녕하세요.
	}
}
