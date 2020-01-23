package testing.examples.mockito._07_Verify;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mockito;

import testing.examples.mockito.Car;
import testing.examples.mockito.Driver;
import testing.examples.mockito.carparts.AirCondition;
import testing.examples.mockito.carparts.ACMode;
import testing.examples.mockito.carparts.Tire;

class Driver_drives{

	@Test
	void with_aircondition_on() {
		Car mockCar = mock(Car.class);
		Driver driver = new Driver(mockCar);
		ArgumentCaptor<AirCondition> acCaptor = 
				ArgumentCaptor.forClass(AirCondition.class);
		

		driver.drive();
		
		Mockito.verify(mockCar).setAC(acCaptor.capture());
		
		AirCondition ac = acCaptor.getValue();
		assertEquals (ACMode.On, ac.getMode());

	}

}
