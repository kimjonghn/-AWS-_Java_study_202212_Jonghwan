package j21_예외;

import java.util.List;

public class ThrowsException {
	
	public static void printList(List<String> list, int size) throws Exception{
		
		for(int i = 0; i < size; i++) {
			System.out.println("[" + i + "]" + list.get(i));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		String[] names = {"김수현", "이종현", "박성진", "김동민"};
		
		try {
			throw new ClassCastException();
//			printList(Arrays.asList(names), 5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {//try가 정상적으로 실행이되고 catch가 실행이 되도 finally는 실행이 된다
			System.out.println("무조건 실행");
		}
		
		System.out.println("프로그램 정상 종료");
	}
}
