package dsfsdfsdfasdf;

public class Computer {

	private String cpuType;
	private int ramSize;
	private int ssdSize;
		
public Computer(String cpuType, int ramSize, int ssdSize) {
	this.cpuType = cpuType;
	this.ramSize = ramSize;
	this.ssdSize = ssdSize;
}

public static ComputerBuilder ComputerBuilder() {
	
	return new ComputerBuilder();
}


public static class ComputerBuilder{
	private String cpuType;
	private int ramSize;
	private int ssdSize;
	
	public ComputerBuilder cpuType(String cpuType) {
		this.cpuType = cpuType;
		return this;
	}
	public ComputerBuilder ramSize(int ramSize) {
		this.ramSize = ramSize;
		return this;
	}
	public ComputerBuilder ssdSize(int ssdSize) {
		this.ssdSize = ssdSize;
		return this;
	}
	public Computer build() {
		return new Computer(cpuType,ramSize,ssdSize);
	}
}


public void showCoumputerInfo() {
		System.out.println("CPU 종류(intel/AMD): " + cpuType);
		System.out.println("RAM 용량(GB) :" + ramSize);
		System.out.println("SSD 용량(GB) :" + ssdSize);
	}
	
}
