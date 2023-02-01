package Memo;

public class Student {
	class Student1{
		private int studentCod;
		private String studentName;
		
		public Student1(int studentCode, String studentName) {
			this.studentCod = studentCode;
			this.studentName = studentName;
		}
		
		public void showStudent() {
			System.out.println(studentCod + studentName);
		}
	}
		
}
