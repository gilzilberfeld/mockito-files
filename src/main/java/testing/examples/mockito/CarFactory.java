package testing.examples.mockito;

public class CarFactory {

	private static Car theCar = new Car();
	
	public static Car buy() {
		return theCar;
	}
}
