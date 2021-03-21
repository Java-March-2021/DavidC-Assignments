package mammals;

public class Bat extends Mammals{
	public Bat(int energyLvl) {
		super(energyLvl);
		this.energyLvl = energyLvl + 200;
	}
	public void fly() {
		System.out.println("Whooosh!...");
		this.energyLvl = energyLvl - 50;
		System.out.println("Bat energy level is now" 
				+ energyLvl);
	}
	public void eatHumans() {
		System.out.println("Ack!  Uh that's not good...");
		this.energyLvl = energyLvl + 25;
		System.out.println("Bat energy level is now " + energyLvl);
	}
	public void attackTown() {
		System.out.println("Oh no!  A town is under attack!");
		this.energyLvl = energyLvl - 100;
		System.out.println("Bat energy level is now" + energyLvl);
	}
}
