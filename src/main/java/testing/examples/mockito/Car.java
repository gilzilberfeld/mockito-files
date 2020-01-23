package testing.examples.mockito;

import org.apache.commons.lang3.NotImplementedException;

import testing.examples.mockito.carparts.AirCondition;
import testing.examples.mockito.carparts.Parts;

public class Car {

	private boolean isRunning;
	private Parts parts;
	
	public boolean isRunning() {
		throw new NotImplementedException("Not yet");
	}

	public Parts getParts() {
		return parts;
	}

	public void setAC(AirCondition capture) {
		throw new NotImplementedException("Not yet");
	}

	public void start() {
		throw new NotImplementedException("Not yet");	
	}


}
