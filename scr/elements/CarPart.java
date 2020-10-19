package elements;
import java.util.Random;

public abstract class CarPart implements Functional{
	
	public int serialNumber;
	public int condition = 100;
	public abstract void status();
	public abstract void function();
	public boolean broken;
	public String partName;
	
//	public void degradate () {
//		condition = (this.condition - 
//	}
	
//	GETTERS
	
	@Override
	public String toString() {
		return "CarPart [serialNumber=" + serialNumber + ", condition=" + condition + ", broken=" + broken
				+ ", partName=" + partName + "]";
	}
	
	public int getSerialNumber() {
		return serialNumber;
	}
	public int getCondition() {
		return condition;
	}
	public boolean getBrokenStatus() {
		return broken;
	}
	public String getPartName() {
		return partName;
	}
	
//	SETTERS
	
	public void generateSerialNumber() {
		Random rand = new Random();
		this.serialNumber = rand.nextInt(9);;
	}
	
	public void setCondition(int condition) {
		if (this.condition == 0) {
			this.condition = condition;
			this.broken = true;
		} else {
			this.condition = condition;
		}
		
	}
	public void setBroken(boolean broken) {
		this.broken = broken;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	
}
