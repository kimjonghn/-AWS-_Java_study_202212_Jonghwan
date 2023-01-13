package j16_Object;

public class ObjectHachCode {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 31);
		Student s2 = new Student("홍길동", 31);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1.hashCode() == s2.hashCode());
	}
	
}
