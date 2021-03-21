package human;

public class Human implements Attackable{
	protected String type;
	protected String name;
	protected int strength = 3;
	protected int intelligence = 3;
	protected int stealth = 3;
	protected int health = 100;

	public Human (String type, String name, int strength, int intelligence, int stealth, int health) {
		this.type = type;
		this.name = name;
		this.strength = strength;
		this.intelligence = intelligence;
		this.stealth = stealth;
		this.health = health;
	}

public int displayHealth() {
	System.out.printf("%s's health is now %d. \n", this.name, this.health);
	return health;
}
public String getType() {
	return type;
}
public void setType(String name) {
	this.type = type;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getIntelligence() {
	return intelligence;
}
public void setIntelligence(int intelligence) {
	this.intelligence = intelligence;
}
public int getHealth() {
	return health;
}
public void setHealth(int health) {
	this.health = health;
}
public int displayAttributes() {
	System.out.printf("Strength: " + strength, "Intelligence: " + intelligence, "Stealth: " + stealth);
	return health;
}

public void attack(Attackable target) {
//	if(attackType.equals("basic")) {
//		int damage = strength;
//	}
//		else if(attackType.equals("deathblow")){
//			health = 0;
//		}
//		else if(attackType.equals("steal")){
//			System.out.println("Ninja steals " + stealth + " health");
//			damage = stealth;
//		}
	int damage = strength;
	int health = target.getHealth();	
	health -= damage;
	target.setHealth(health);
	System.out.printf("%s attacks %s for %d points of damage! \n", this.name, target.getName(), damage);
	System.out.printf("%s's health is now %d. \n", target.getName(), target.getHealth());
}
public void takeDamage(int damageAmount) {
	this.health = damageAmount;
}
//public void attack(Attackable target) {
//	this.attack(target);
//}

}