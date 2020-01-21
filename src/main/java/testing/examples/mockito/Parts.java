package testing.examples.mockito;

import java.util.List;

public class Parts {
	
	List<Tire> tires;
	
	public Parts() {
		tires = List.of(new Tire(), 
						new Tire(), 
						new Tire(), 
						new Tire());
		
	}
	public List<Tire> getTires() {
		return tires;
	}
}
