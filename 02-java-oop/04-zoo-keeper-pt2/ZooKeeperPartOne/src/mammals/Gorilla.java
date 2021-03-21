package mammals;

public class Gorilla extends Mammals {
	public Gorilla(int energyLvl) {
		super(energyLvl);
	}
	public void throwSomething() {
		System.out.println("The Gorilla has thrown something.");
		this.energyLvl = energyLvl - 5;
		System.out.println("Gorrilla energy level is now: " + energyLvl);
		}
	public void eatBanannas() {
		this.energyLvl = energyLvl + 10;
		System.out.println("Gorilla has eaten some Banannas.");
		System.out.println("Gorilla energy level is now: "   + energyLvl);
	}
	public void climb() {
		System.out.println("Gorilla is climbing");
		this.energyLvl = energyLvl -10;
		System.out.println("Gorilla energy level is now: " + energyLvl);
	}
}

