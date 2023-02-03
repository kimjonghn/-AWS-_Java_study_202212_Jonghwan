package 연습;

public class Factory {

	private static Factory instance = null;
	private String factoryName;

	private Factory() {
	}

	public static Factory getInstace() {

		if (instance == null) {
			instance = new Factory();
		}

		return instance;
	}

}
