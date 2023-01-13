package j17_스태틱.싱글톤;
//public : 다른 클래서 어디서든 생성 가능
public class KIA {
	//여기서 부터
	private static KIA instance = null;
	
	private KIA() {}//pivate 는 바깥에서 생성할수 없다 지금 class에서만 생성가능!!!
	
	public static KIA getInstance() {//getInastance 스태틱 메소드(주소값을 가지고 오기위한) static 은 뒤에 .찍으면 바로 생성가능
		if(instance == null) { 
			instance = new KIA();
			
		}
		return instance;
	}// 여기까지 싱글톤을 만드려면 항상 세트
	
	public void printCompanyName() {
		System.out.println(getClass().getSimpleName());
	}
}
