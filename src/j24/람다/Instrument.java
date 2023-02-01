package j24.람다;

//람다를 의미한다.
//메서드를 하나만 써라고 알림.
@FunctionalInterface 
public interface Instrument {
	
	public String play(String instrument);
	
	public default void testPrint() {
		System.out.println("테스트");//default메서드는 사용가능. (구현된 메서드이기 때문)
	}
}
