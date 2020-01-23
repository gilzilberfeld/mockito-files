package testing.examples.mockito._07_Verify;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import testing.examples.mockito.Car;
import testing.examples.mockito.Driver;
import testing.examples.mockito.carparts.ACMode;
import testing.examples.mockito.carparts.AirCondition;

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
