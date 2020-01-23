package testing.examples.mockito._05_DeepStubs;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import testing.examples.mockito.Car;
import testing.examples.mockito.Driver;
import testing.examples.mockito.carparts.Tire;

class Driver_cannot_use_car {

	@Test
	void with_flat_tires() {
		Car mockCar = mock(Car.class, RETURNS_DEEP_STUBS);
		Driver driver = new Driver(mockCar);

		Tire mockTire = mockCar.getParts().getTires().get(1);
		when(mockTire.isFlat()).thenReturn(true);
		
		assertFalse(driver.canUseCar());
	}

}
