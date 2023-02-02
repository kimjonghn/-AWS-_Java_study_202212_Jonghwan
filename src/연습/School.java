package 연습;
//싱글톤으로
public class School {
	private static School instance = null;
	private String schoolName;
	
	private School() {}
	
	public static School getinstance() {
		
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}
}
