package j16_Object;

public class ObjectEquals {
	public static void main(String[] args) {
		String name1 = "김준일";
		String name2 = "김준일";
		String name3 = new String("김준일");
		
		System.out.println(name1);
		System.out.println(name2);
		
		System.out.println(name1 == name2);//주소비교 true
		System.out.println(name1.equals(name3));//true  // equals = > name3값을 비교
		//////////////////////////////////////////////////////
		
		Student s1 = new Student("김준일", 24);
		Student s2 = new Student("김준일", 24);
		SubStudent s3 = new SubStudent("김준일", 24);
		
		
		System.out.println(s1.hashCode());//주소값 비교 false
		System.out.println(s2.hashCode());
		
		System.out.println(s1.hashCode() == s2.hashCode());
		System.out.println(s1.hashCode() == s3.hashCode());
	}
}