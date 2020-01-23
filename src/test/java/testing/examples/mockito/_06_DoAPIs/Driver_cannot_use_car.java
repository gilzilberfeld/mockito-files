package testing.examples.mockito._06_DoAPIs;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import testing.examples.mockito.Car;
import testing.examples.mockito.Driver;
import testing.examples.mockito.carparts.Tire;

class Driver_cannot_use_car {

	@Disabled
	@Test
	void when_door_is_locked() {
		Driver driver = 
				mock(Driver.class, Mockito.CALLS_REAL_METHODS);
		when(driver.canEnter()).thenReturn(true);
		
		assertFalse(driver.canEnter());
	}

	@Test
	void when_door_is_locked_2() {

		Driver driver = 
				mock(Driver.class, Mockito.CALLS_REAL_METHODS);
		doReturn(false).when(driver).canEnter();
		
		assertFalse(driver.canEnter());
	}

}
