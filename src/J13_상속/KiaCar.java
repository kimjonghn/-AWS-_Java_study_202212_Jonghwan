package J13_상속;

public class KiaCar extends Car {
		
	public KiaCar() {
		super();//부모의 생성자를 호출하는것	(부모의 주소)	
		System.out.println("자식");
	}
	
	@Override
	public int discountPrice(int percentage) {
		return super.discountPrice(percentage);
	}
	
	
}
/*
 * 오버라이드를 하면 주소값도 달라짐
 * A,B,C
 * A a = new B()
 * A = int show(int a int b)
 * B = int show(int x int y)
 */