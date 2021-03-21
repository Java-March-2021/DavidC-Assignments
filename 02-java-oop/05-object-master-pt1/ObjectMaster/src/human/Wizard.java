package human;

public class Wizard extends Human implements Attackable {
	protected String type;
	protected String name;
	protected int strength = 3;
	protected int intelligence = 8;
	protected int stealth = 3;
	protected int health = 100;
	
	public Wizard (String type, String name, int strength, int intelligence, int stealth, int health) {
		super(type, name, strength, intelligence, stealth, health);
		this.type = type;
		this.name = name;
		this.strength = strength;
		this.intelligence = intelligence;
		this.stealth = stealth;
		this.health = health;
	}
	public void heal(Attackable target) {
		int intelligence = this.intelligence;
		int heal = intelligence;
		health = target.getHealth();
		health += heal;
		target.setHealth(health);
		System.out.printf("%s is healed by %d points. \n", target.getName(), this.intelligence);
	}
	public void fireball(Attackable target) {
		int fireball = intelligence*3;
		health -= fireball;
		target.setHealth(health);
		System.out.printf("%s is hit by a fireball and takes %d damage. \n", target.getName(), target.getHealth());
	}
}


