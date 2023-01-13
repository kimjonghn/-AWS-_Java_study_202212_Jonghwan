package j17_스태틱;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Car {
	
	private static final int NOW_YEAR = LocalDateTime.now().getYear();	
	
	private static final String CODE= "KIA_" + NOW_YEAR + "-";
		
	private static int ai = 1;
	
	private String serialCode; //KIA-2023-00
	private String modelName;
	
	
	
	public Car(String modelName) {
		serialCode = CODE + String.format("%04d", ai);// 0000   에 (ai = 1)1을 더해준다 
		this.modelName = modelName;
		ai++;
	}
	public static int getAutoIncrement() {
		System.out.println("현재 AI: " + ai);
		return ai;
	}


	@Override
	public String toString() {
		return "Car [serialCode=" + serialCode + ", nodelName=" + modelName + "]";
	}

	

	
	
	
	
	
}
