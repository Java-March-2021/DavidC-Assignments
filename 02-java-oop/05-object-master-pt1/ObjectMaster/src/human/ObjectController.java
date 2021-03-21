package human;

public class ObjectController {
public static void main(String[] args) {
	Human Steve = new Human("Human", "Steve",3,3,3,100);
	Human Alex = new Human("Human", "Alex",3,3,3,100);
	Ninja Katie = new Ninja("Ninja","Katie",3,3,10,100);
	Samurai Liam = new Samurai("Samurai","Liam",3,3,3,200);
	Wizard David = new Wizard("Wizard","David",3,8,3,50);
	
	Alex.attack(Steve);
	Steve.displayHealth();
	Steve.attack(Alex);
	Alex.displayHealth();
}
}
