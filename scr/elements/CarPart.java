import java.util.Random;

abstract class CarPart implements Functional{
	
	public int serialNumber;
	public int condition = 100;
	public abstract void status();
	public abstract void function();
	public boolean broken;
	public String partName;
	
//	GETTERS
	
	public void generateSerialNumber() {
		Random rand = new Random();
		this.serialNumber = rand.nextInt(9);;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public int getCondition() {
		return condition;
	}
	public boolean isBroken() {
		return broken;
	}
	public String getPartName() {
		return partName;
	}
	
//	SETTERS
	
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public void setCondition(int condition) {
		this.condition = condition;
	}
	public void setBroken(boolean broken) {
		this.broken = broken;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	
}
