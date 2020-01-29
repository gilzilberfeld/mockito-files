package testing.examples.mockito._04_PartialMocking;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import testing.examples.mockito.Driver;

class Driver_cannot_use_car_correct {

	@Test
	void when_door_is_locked() {

		Driver driver = 
				mock(Driver.class, Mockito.CALLS_REAL_METHODS);
		doReturn(false).when(driver).canEnter();
		
		assertFalse(driver.canEnter());
	}

}
