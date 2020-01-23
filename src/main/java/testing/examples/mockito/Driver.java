package testing.examples.mockito;

import java.util.List;

import org.apache.commons.lang3.NotImplementedException;

import testing.examples.mockito.carparts.ACMode;
import testing.examples.mockito.carparts.AirCondition;
import testing.examples.mockito.carparts.Tire;

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

	public boolean canEnter() {
		throw new NotImplementedException("Not yet");
	}

	public void drive() {
		car.setAC(new AirCondition(ACMode.On) );
		car.start();
	}
	
	
}
