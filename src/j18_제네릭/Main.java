package j18_제네릭;

public class Main {
	public static void main(String[] args) {
		TestData<String, Integer> td = new TestData<String, Integer>("종환", 25);
		TestData<String, Double> td2 = new TestData<String, Double>("jong",25.5);
		System.out.println(td);
		System.out.println(td2);
		
		CMRespDto<TestData<String, Integer>> cm =
				new CMRespDto<TestData<String, Integer>>(200, "성공", td);// td = > 데이터
		
		System.out.println(cm); 
	}
}
