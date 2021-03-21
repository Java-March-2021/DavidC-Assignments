package mammals;

public class Mammals {
	//energy level (default 100)
	//displayEnergy method: print and return energy level
	
	protected int energyLvl = 100;
	
	public int displayEnergy() {
		System.out.println("The Energy Level is " + energyLvl);
		return energyLvl;
	}
	public Mammals(int energyLvl) {
		this.energyLvl = energyLvl;
	}
	public int getHealth(int health) {
		return health;
		
	}
	
	
	
	
}
