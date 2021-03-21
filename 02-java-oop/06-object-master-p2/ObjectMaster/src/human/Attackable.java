package human;

public interface Attackable {
	int getHealth();
	void setHealth(int health);
	void takeDamage(int damageAmount);
	String getName();

}
