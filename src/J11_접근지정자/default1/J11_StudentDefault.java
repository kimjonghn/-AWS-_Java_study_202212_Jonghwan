package J11_접근지정자.default1;

public class J11_StudentDefault {

	public String name;
	public int age;
	
	public J11_StudentDefault() {
		
	}
	public J11_StudentDefault(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void printInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
	
	//Getter : 값을 가지고 오는 용도
		public String getName() {
			return name;
		}
		//Setter : 값을 대입하는 용도
		public void setName(String name) {
			this.name = name;
		}
}
//접근지정자를 설정하지 않은 상태는 default(class 내에서만)