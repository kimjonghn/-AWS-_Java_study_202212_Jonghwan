package dsfsdfsdfasdf;

public class ComputerMain {
	public static void main(String[] args) {
		
		Computer computer = Computer.ComputerBuilder()
				.cpuType("intel")
				.ramSize(16)
				.ssdSize(512)
				.build();
		
		
		computer.showCoumputerInfo();
			
	}
}
