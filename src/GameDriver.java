import java.util.Scanner;

public class GameDriver {
	Scanner kb;

	public GameDriver(Scanner kb) {
		this.kb = kb;
	}

	public void RunGame(Scanner kb) {
		
		System.out.println("Enter your name");
		String name = kb.nextLine();
		Player p1 = new Player(name, kb);
		Enemy e1 = new Enemy("drunk");
		Enemy e2 = new Enemy("homeless guy");
		Enemy e3 = new Enemy("Harry and Marv");
		Enemy e4 = new Enemy("pizza guy");

		Intro(kb);
		this.Combat(e1, p1);
		Alleyway(kb);
		this.Combat(e2, p1);
		CentralPark(kb);
		this.Combat(e3, p1);
		PizzaParlor(kb, p1, e4);

	}

	public void Intro(Scanner kb) {
		System.out.println("\nYou’re in NYC on a Saturday night, inside some dive bar.");
		System.out.println("You’ve been bar hopping since you left Yankee Stadium.");
		System.out.println("\nPress enter to continue...");
		kb.nextLine();
		System.out.println("Oh, man… How many beers and shots did I have?!");
		System.out.println("Wait, something is happening here…");
		System.out.println("What is this jabroni ranting about?");
		System.out.println("\nPress enter to continue...");
		kb.nextLine();
		System.out.println("Looks like I spilt my beer on his Tims…");
		System.out.println("Guess it’s going to be another one of those Saturday nights.");
//		System.out.println("Do you want to fight with this jabroni or get a boucer?");
		System.out.println("\nPress enter to continue...");
		kb.nextLine();
	}

	public void Alleyway(Scanner kb) {
		System.out.println("\nLooks like we've been banned from another bar in the city.");
		System.out.println("That bouncer was a tool for kicking you out after railing that jabroni.");
		System.out.println("\nI'm freaking starving, after jacking that jabroni.");
		System.out.println("Let's go grab a slice.");
		System.out.println("\nPress enter to continue...");
		kb.nextLine();
		System.out.println("So do we go to the east side or the west side, down that alley?");
		kb.nextLine();
		System.out.println("Well I guess we know where that smell came from...");
		System.out.println("\nHomeless Guy: Wanna see my pickle jar collection?");
		System.out.println("I'm ThE PiCkLe KING, wHaTeVeR y0u g0t wE cAn pIcKlE iT!!!\n");
		System.out.println("Piss pants over here wants to fight you for walking down his alleyway");
		System.out.println("\nPress enter to continue...");
		kb.nextLine();

	}

	public void CentralPark(Scanner kb) {
		System.out.println("How the hell did I end up in Central Park?");
		System.out.println("Great, street lights are going out around here.");
		System.out.println("Better get a slice before I get mugged.");
		System.out.println("\nPress enter to continue...");
		kb.nextLine();
		System.out.println("\nMarv: My how the tables have turned");
		System.out.println("Harry: Let's go for a lil stroll in the park");
		System.out.println("\nPress enter to continue...");
		kb.nextLine();
		System.out.println("\n(Marv runs your pockets for cash)");
		System.out.println("(Harry slaps the back of your head with his billy club)");
		System.out.println(
				"\n(Pigeon Lady shows up out of no where. Scares Harry and Marv but they still have your money)");
		System.out.println("Fight!");
		System.out.println("\nPress enter to continue...\n");
		kb.nextLine();

	}

	public void PizzaParlor(Scanner kb, Player p1, Enemy e4) {
		System.out.println("You finally got to the best pizza in the city.");
		System.out.println("Pizza Guy(Two Bits Tony): What can I getchu chief?");
		System.out.println("Two Bits Tony: Com'on Sport, I aint got all day.");
		System.out.println("\nType your pizza order...\n");
		kb.nextLine();

		System.out.println("**********************************************************");
		System.out.println("*                                                        *");
		System.out.println("*                                                        *");
		System.out.println("*  A - Grab pizza and run.                               *");
		System.out.println("*  B - Challenge him to Rock, Paper, Scissor for pizza.  *");
		if (p1.getMoney() > 2) {
			System.out.println("*  C - Pay for pizza.                                    *");

		}
		System.out.println("*                                                        *");
		System.out.println("**********************************************************");
		for (int i = 0; i < 1;) {
			String answer = kb.nextLine().toLowerCase();
			switch (answer) {
			case "a":
				Combat(e4, p1);
				break;
			case "b":
				rockPaperScissors(kb);
				break;
			case "c":
				p1.setMoney(p1.getMoney() - 2);
				System.out.println("\nTwo Bits Tony: Listen I'm about to close up shop, all I got is pepperoni.");
				System.out.println("Guess you're eating pepperoni! Thanks for playing!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Answer");
				break;
			}
		}
	}

	public void rockPaperScissors(Scanner kb) {
		System.out.println("So you want to Rock, Paper, Scissor me for a slice?");
		System.out.println("Listen kid, I'm Brooklyn's all time RPS CHAMPION!!!");
		System.out.println("Do you smell what the ROOOOOOOOOCK is cooking?!? (It's pizza)\n");
		String user = "";
		int comt = (int) (3 * Math.random()) + 1;
		String comp = "";
		if (comt == 1) {
			comp = "R";
		} else if (comt == 2) {
			comp = "P";
		} else {
			comp = "S";
		}
		for (int i = 0; i < 1;) {
			System.out.println("Please select one of [R/P/S]: ");
			user = kb.nextLine().toUpperCase();
			switch (user) {
			case "R":
				System.out.println("Two Bits Tony: I choose: " + comp);
				System.out.println("You chose: Rock");
				i++;
				break;
			case "P":
				System.out.println("Two Bits Tony: I choose: " + comp);
				System.out.println("You chose: Paper");
				i++;
				break;
			case "S":
				System.out.println("Two Bits Tony: I choose: " + comp);
				System.out.println("You chose: Scissors");
				i++;
				break;
			default:
				System.out.println("Invalid entry, try again");
			}
		}

		if (user.equals(comp)) {
			System.out.println("A tie!");
		} else if (user.equals("R")) {
			if (comp.equals("S")) {
				System.out.println("Rock beats scissor - you win!");
				System.out.println("Two Bits Tony: Take your f@#%ing slice and get outa my face.");
			System.exit(0);}
			else if (comp.equals("P")) {
				System.out.println("Paper beats rock - you lose");
				System.out.println("Two Bits Tony: Guess your broke ass is starting your diet.");
				System.exit(0);
			}
		} else if (user.equals("P")) {
			if (comp.equals("S")) {
				System.out.println("Scissors beats paper- you lose");
				System.out.println("Two Bits Tony: Look at this wiseguy trying to lose his way to a slice.");
				System.exit(0);
			}
		} else if (comp.equals("R")) {
			System.out.println("Paper beats rock - you win");
			System.out.println("Two Bits Tony: You waiting for something else? Get your slice and split, kid!");

			System.exit(0);
		} else if (user.equals("S")) {

			if (comp.equals("P")) {
				System.out.println("Scissors beats paper - you win!");
				System.out.println("Two Bits Tony: You tell anyone your drunk @$$ beat me and ");
				System.out.println("I'll grind you up and make gravy out of you.");
				System.exit(0);
			}
			else if (comp.equals("R")) {
				System.out.println("Rock beats scissors - you lose!");
				System.out.println("Two Bits Tony: Hail to the Pizza King, baby!");
				System.exit(0);
			}
		}
	}

	public void Combat(Enemy villain, Player hero) {
		System.out.println("\nThis " + villain.getName() + " wants to fight!");
		// set up combat options

		while (true) {
			if (villainAttack(villain, hero)) {
				System.out.println("WASTED");
				System.exit(0);
				break;
			}
			if (heroAttack(villain, hero))
				break;
		}
		// Grammar needs fixing
		System.out.printf("\nYou won the fight with %d health left and got $%.2f from %s's pockets. %n",
				hero.getHealth(), villain.getMoney(), villain.getName());
		hero.setMoney(hero.getMoney() + villain.getMoney());
		System.out.println("\nPress enter to continue...");
		kb.nextLine();

	}

	public boolean villainAttack(Enemy villain, Player hero) {
		int damage = 0;
		damage = hero.damage(villain.attack(villain.getStrength()), hero.getSkill());
		System.out.println(villain.getName() + " hits you for " + damage);
		hero.setHealth(hero.getHealth() - damage);
		System.out.println("You have " + hero.getHealth() + " left.");
		return hero.deathCheck(hero.getHealth());

	}

	public boolean heroAttack(Enemy villain, Player hero) {
		int damage = 0;
		damage = villain.damage(hero.attack(hero.getStrength()), villain.getSkill());
		System.out.println("You hit " + villain.getName() + " for " + damage + " damage.");
		villain.setHealth(villain.getHealth() - damage);
		System.out.println(villain.getName() + " has " + villain.getHealth() + " left.");
		return villain.deathCheck(villain.getHealth());
	}

	
	public void Header() {
		System.out.println("The Thirteenth Step");
	}
}
