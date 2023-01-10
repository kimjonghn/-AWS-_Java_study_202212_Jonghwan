package J13_상속;

public class ExtendsMain {

	public static void main(String[] args) {
		//kiacar를 생성하면은 Car 까지 같이 생성이 된다
		KiaCar KiaCar = new KiaCar();
		
		System.out.println(KiaCar);
		
		KiaCar.setPrice(300000);
		
		System.out.println(KiaCar);
		
		System.out.println(KiaCar.getPrice());
		System.out.println(KiaCar.discountPrice(20));
	}

}
