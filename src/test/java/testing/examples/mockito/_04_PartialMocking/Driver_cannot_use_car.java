package testing.examples.mockito._04_PartialMocking;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import testing.examples.mockito.Driver;

class Driver_cannot_use_car {

	@Test
	void when_door_is_locked() {
		Driver driver = 
				mock(Driver.class, Mockito.CALLS_REAL_METHODS);
		when(driver.canEnter()).thenReturn(true);
		
		assertFalse(driver.canEnter());
	}

}
