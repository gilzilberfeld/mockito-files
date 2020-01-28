package testing.examples.mockito._07_Spring;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import testing.examples.mockito.Car;
import testing.examples.mockito.Driver;

@SpringBootTest
class driver_cannot_start_mockbean {

	@MockBean
	Car mockCar;
	
	@Test
	void a_running_car() {
		when(mockCar.isRunning()).thenReturn(true);
		
		Driver driver = new Driver(mockCar);
		
		assertFalse(driver.canDrive());
	}

}
