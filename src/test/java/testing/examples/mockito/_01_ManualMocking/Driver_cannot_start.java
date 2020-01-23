package testing.examples.mockito._01_ManualMocking;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import testing.examples.mockito.Car;
import testing.examples.mockito.Driver;

class Driver_cannot_start {

	@Test
	void a_running_car() {
		Car mockCar = new MockRunningCar();
		Driver driver = new Driver(mockCar);
		
		assertFalse(driver.canDrive());
		
	}

}
