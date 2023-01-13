package j17_스태틱;

public class StudentMain {

	public static void main(String[] args) {
		Student[] students = new Student[5];
		Teacher[] teachers = new Teacher[5];
		
		
		
		students[0] = new Student("홍길동");
		students[1] = new Student("홍길동1");
		students[2] = new Student("홍길동2");
		students[3] = new Student("홍길동3");
		students[4] = new Student("홍길동4");
		
		teachers[0] = new Teacher("바보");
		teachers[1] = new Teacher("바보1");
		teachers[2] = new Teacher("바보2");
		teachers[3] = new Teacher("바보3");
		teachers[4] = new Teacher("바보4");
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
			System.out.println(teachers[i]);
			System.out.println();
			
		}
		int j = 0;
		for(Student s : students) { //System.out.println( s.toSting());
			System.out.println(s);
			System.out.println(teachers[j]);
			j++;
		}
//		for(teacher t : teachers) {
//			System.out.println(t));
//		}
		
		System.out.println(Student.getAutoIncrement());
		
		

	}

}
