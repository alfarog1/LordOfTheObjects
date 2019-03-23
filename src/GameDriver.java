import java.util.Scanner;

public class GameDriver {
	Scanner kb;

	public GameDriver(Scanner kb) {
		this.kb = kb;
	}

	public void RunGame() {
		System.out.println("Enter your name");
		String name = kb.next();
		Player p1 = new Player(name, kb);
		Enemy e1 = new Enemy("drunk");
		Enemy e2 = new Enemy("homeless guy");
		Enemy e3 = new Enemy("pigeon lady");
		Enemy e4 = new Enemy("pizza guy");

		Intro();
		this.Combat(e1, p1);
	}

	public void Intro() {
		System.out.println(
				"You’re in NYC on a Saturday night, inside some dive bar. You’ve been bar hopping since you left Yankee Stadium. ");
		System.out.println("Press enter to continue...");
		kb.nextLine();
		System.out.println("Oh, man… How many beers and shots did I have?!");
		System.out.println("Wait, something is happening here…");
		System.out.println("What is this jabroni ranting about?");
		System.out.println("Press enter to continue...");
		kb.nextLine();
		System.out.println("Looks like I spilt my beer on his Tims…");
		System.out.println("Guess it’s going to be another one of those Saturday nights.");
//		System.out.println("Do you want to fight with this jabroni or get a boucer?");
		System.out.println("Press enter to continue...");
		kb.nextLine();
	}

	public void Combat(Enemy villain, Player hero) {
		System.out.println("This " + villain.getName() + " wants to fight!");
		//set up combat options
		villainAttack(villain, hero);
		
		
		
		
		
	}

	public boolean villainAttack(Enemy villain, Player hero) {
		int damage = 0;
		damage = hero.damage(villain.attack(villain.getStrength()), hero.getSkill());
		System.out.println(villain + " hits you for " + damage);
		hero.setHealth(hero.getHealth() - damage);
		System.out.println("You have " + hero.getHealth() + " left.");
		return hero.deathCheck(hero.getHealth());
		
	}

	public boolean heroAttack(Enemy villain, Player hero) {
		int damage = 0;
		damage = villain.damage(hero.attack(hero.getStrength()), villain.getSkill());
		villain.setHealth(villain.getHealth() - damage);
		return villain.deathCheck(villain.getHealth());
	}

}
