package testing.examples.mockito._07_Spring;

import static org.mockito.Mockito.mock;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import testing.examples.mockito.Car;

@Configuration
public class CarConfig {

	@Bean 
	public Car car() {
		return mock(Car.class);
	}
}
