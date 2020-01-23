package testing.examples.mockito._04_PartialMocking;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import testing.examples.mockito.Car;
import testing.examples.mockito.Driver;

public class Driver_cannot_start{

	@Test
	public void without_keys() {
		Driver driver = mock(Driver.class, Mockito.CALLS_REAL_METHODS);
		when(driver.hasKeys()).thenReturn(false);
		
		assertFalse(driver.canDrive());
	}
}
