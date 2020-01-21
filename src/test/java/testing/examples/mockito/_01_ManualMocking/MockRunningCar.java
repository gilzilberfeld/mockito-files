package testing.examples.mockito._01_ManualMocking;

import testing.examples.mockito.Car;

public class MockRunningCar extends Car {
	
	@Override
	public boolean isRunning() {
		return true;
	}

}
