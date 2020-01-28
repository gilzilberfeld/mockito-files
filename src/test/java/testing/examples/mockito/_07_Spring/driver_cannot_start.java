package testing.examples.mockito._07_Spring;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import testing.examples.mockito.Car;
import testing.examples.mockito.Driver;

@SpringBootTest
@ContextConfiguration(classes = {CarConfig.class})
class driver_cannot_start {

	@Autowired
	Car mockCar;
	
	@Test
	void a_running_car() {
		when(mockCar.isRunning()).thenReturn(true);
		
		Driver driver = new Driver(mockCar);
		
		assertFalse(driver.canDrive());
	}

}
