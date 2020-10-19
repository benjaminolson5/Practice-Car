package elements;

import java.util.ArrayList;
import java.util.List;

public class Car {
	
	List<CarPart> carParts = new ArrayList<CarPart>();
	
	public Car () {
		Brakes brake = new Brakes();
		Battery battery = new Battery();
		Axel axel = new Axel();
		Alternator alternator = new Alternator();
		Tire tire1 = new Tire();
		Tire tire2 = new Tire();
		Tire tire3 = new Tire();
		Tire tire4 = new Tire();
		Radiator radiator = new Radiator();
		Engine engine = new Engine();
		
		carParts.add(brake);
		carParts.add(battery);
		carParts.add(axel);
		carParts.add(alternator);
		carParts.add(tire1);
		carParts.add(tire2);
		carParts.add(tire3);
		carParts.add(tire4);
		carParts.add(radiator);
		carParts.add(engine);
		
	}

	public void run () {
		System.out.println("This is the Car run method.");
	}
	
}
