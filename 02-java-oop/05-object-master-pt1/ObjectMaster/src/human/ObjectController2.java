package human;

//import java.util.ArrayList;

public class ObjectController2 {

	public static void main(String[] args) {
		Human Steve = new Human("Human","Steve",3,3,3,100);
		Human Alex = new Human("Human","Alex",3,3,3,100);
		Ninja Katie = new Ninja("Ninja","Katie", 3,3,10,100);
		Samurai Liam = new Samurai("Samurai","Liam", 3,3,3,200);
		Wizard David = new Wizard("Wizard","David", 3,8,3,50);
		Samurai Mike = new Samurai("Samurai","Mike", 3,3,3,200);
		
//		ArrayList<Human> ourHumans = new ArrayList<Human>();
//		ourHumans.add(Katie);
//		ourHumans.add(Alex);
//		ourHumans.add(Katie);
//		ourHumans.add(Liam);
//		ourHumans.add(David);
		
//		for(Human h : ourHumans) {
//			System.out.println(h.getType());
//		}
		
		Katie.attack(Liam);
		Liam.attack(Katie);
		Steve.attack(Katie);
		Alex.attack(David);
		David.fireball(Steve);
		Katie.steal(Liam);
		Katie.runAway();
		Liam.deathBlow(Alex);
		David.heal(Liam);
		Liam.meditate();
		Mike.attack(Steve);
		Steve.displayHealth();
		Alex.displayHealth();
		Katie.displayHealth();
		Liam.displayHealth();
		David.displayHealth();
		System.out.println("Total Number of Samurai:  " + Samurai.numOfSamurai);
	}
}
