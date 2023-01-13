package j17_스태틱;

public class CarMain {
	public static void main(String[] args) {
		Car[] cars = new Car[3];
		
		cars[0] = new Car("KIA");
		cars[1] = new Car("K-1");
		cars[2] = new Car("K-3");
		
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		for(Car c : cars) {
			System.out.println(c);
		}
	}
}
