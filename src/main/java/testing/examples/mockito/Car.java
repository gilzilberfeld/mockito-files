package testing.examples.mockito;

import org.apache.commons.lang3.NotImplementedException;

public class Car {

	private boolean isRunning;
	private Parts parts;
	
	public boolean isRunning() {
		throw new NotImplementedException("Not yet");
	}

	public Parts getParts() {
		return parts;
	}


}
