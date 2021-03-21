package human;

public class Ninja extends Human implements Attackable {
	protected String type;
	protected String name;
	protected int strength = 3;
	protected int intelligence = 3;
	protected int stealth = 10;
	protected int health = 100;
	
	public Ninja (String type, String name, int strength, int intelligence, int stealth, int health) {
		super(type, name, strength, intelligence, stealth, health);
		this.type = type;
		this.name = name;
		this.strength = strength;
		this.intelligence = intelligence;
		this.stealth = stealth;
		this.health = health;
	}
	public void steal(Attackable target) {
		int damage = stealth;
		int health = target.getHealth();
		health -= damage;
		target.setHealth(health);
		System.out.printf("%s steals %d from %s's health! \n", this.getName(), this.stealth, target.getName());
		recover();
	}
	public void recover() {
		int recover = stealth;
		int health = this.getHealth();
		health += recover;
		this.setHealth(health);
		System.out.printf("%s recovers %d health. \n", this.getName(), this.stealth);
	} 
	public void runAway() {
		int runAway = 10;
		int health = this.getHealth();
		health -= runAway;
		this.setHealth(health);
		System.out.printf("%s vanishes before your eyes! \n", this.getName());
	}
}
