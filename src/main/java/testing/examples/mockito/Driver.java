package testing.examples.mockito;

import java.util.List;
import java.util.function.BooleanSupplier;

public class Driver {

	private Car car;
	
	public Driver(Car car) {
		this.car = car;
	}

	public boolean canDrive() {
		if (!hasKeys())
			return false;
		return !car.isRunning();
	}

	public boolean hasKeys() {
		return true;
	}
	
	private boolean isCarBroken() {
		List<Tire> tires = car.getParts().getTires();

		return !tires
				.stream()
				.allMatch( tire -> tire.isFlat() == false);
	}

	public boolean canUseCar() {
		return !isCarBroken();
	}
}
