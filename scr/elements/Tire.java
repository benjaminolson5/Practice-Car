package elements;

public class Tire extends CarPart{
	
	public enum tireType {

		DIRECTIONAL, 
		UNIDIRECTIONAL,
		SYMMETRICAL,
		ASYMMETRICAL
		
	}
	
	public int tirePressure;
	public String tirePosition;
	public int wheelCount = 4;
	public tireType tread;
	
	public Tire () {
		System.out.println("Wheel has been created");
	}
	
	public Tire (int tirePressure, int wheelCount, tireType tread, String tirePosition) {
		this.tirePressure = tirePressure;
		this.tread = tread;
		this.tirePosition = tirePosition;
	}

	@Override
	public void status() {
		// TODO Auto-generated method stub
	}

	@Override
	public void function() {
		// TODO Auto-generated method stub
	}
}
