package elements;

public class Engine extends CarPart{
	
	public enum fuelType {
		DIESEL, 
		ETHANOL,
		GASOLINE,
		ELECTRICITY
	}
	
	public fuelType fuel;
	public int pistonNum;
	
	public Engine() {
		System.out.println("Engine has been created");
	}
	
	public Engine(fuelType fuel, int pistonNum) {
		this.condition = 100;
		this.fuel = fuel;
		this.pistonNum = pistonNum;
	}
	
	public void status() {
		// TODO Auto-generated method stub
	}

	public void function() {
		// TODO Auto-generated method stub
	}

	public fuelType getFuel() {
		return fuel;
	}
	
	public void setFuel (fuelType fuel) {
		this.fuel = fuel;
	}

	
}
