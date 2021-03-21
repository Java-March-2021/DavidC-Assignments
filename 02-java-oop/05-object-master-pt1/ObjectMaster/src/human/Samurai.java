package human;

public class Samurai extends Human implements Attackable {
	protected String type;
	protected String name;
	protected int strength = 3;
	protected int intelligence = 3;
	protected int stealth = 3;
	protected int health = 200;
	static int numOfSamurai;
	
	public Samurai (String type, String name, int strength, int intelligence, int stealth, int health) {
		super(type, name, strength, intelligence, stealth, health);
		this.type = type;
		this.name = name;
		this.strength = strength;
		this.intelligence = intelligence;
		this.stealth = stealth;
		this.health = health;
		numOfSamurai++;
	}

	public void deathBlowReduce() {
		int health = this.health;
		int deathBlowReduce = health/2;
		health -= deathBlowReduce;
		this.setHealth(health);
		System.out.printf("%s's health is reduced by %d \n", this.getName(), this.getHealth());
	}
	public void deathBlow(Attackable target) {
		int health = target.getHealth();
		health = 0;
		target.setHealth(health);
		System.out.printf("%s is killed by Samurai death blow! \n", target.getName());
		deathBlowReduce();
	}
	public void meditate() {
		int health = this.health;
		int meditate = this.health/2;
		this.health = health + meditate;
		this.setHealth(health);
		System.out.printf("%s meditates and recovers %d health. \n", this.getName(), meditate);
	}
	
}


