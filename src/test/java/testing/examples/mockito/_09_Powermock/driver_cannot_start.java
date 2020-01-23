package testing.examples.mockito._09_Powermock;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareOnlyThisForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import testing.examples.mockito.CannotStartException;
import testing.examples.mockito.Car;
import testing.examples.mockito.CarFactory;
import testing.examples.mockito.Driver;

@RunWith(PowerMockRunner.class)
@PrepareOnlyThisForTest({ CarFactory.class })
public class driver_cannot_start {

	@Test(expected = CannotStartException.class)
	public void a_car_from_factory() {

		Car mockCar = mock(Car.class);
		when(mockCar.isRunning()).thenThrow(new CannotStartException());

		PowerMockito.mockStatic(CarFactory.class);
		PowerMockito.when(CarFactory.buy()).thenReturn(mockCar);

		Driver driver = new Driver(CarFactory.buy());
		driver.canDrive();

		fail("Should have thrown an exception");
	}

}
