package testing.examples.mockito._03_Annotations;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import testing.examples.mockito.Car;
import testing.examples.mockito.Driver;

class Driver_cannot_start {

	@Mock
	Car mockCar;
	
	@BeforeEach
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	void a_running_car() {
		when(mockCar.isRunning()).thenReturn(true);
		
		Driver driver = new Driver(mockCar);

		assertFalse(driver.canDrive());
	}

}
