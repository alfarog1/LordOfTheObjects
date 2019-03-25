import java.util.Scanner;

public class GameDriver {
	Scanner kb;

	public GameDriver(Scanner kb) {
		this.kb = kb;
	}

	public void RunGame(Scanner kb) {

		Header(kb);
		System.out.println("Enter your name");
		String name = kb.nextLine();
		Player p1 = new Player(name, kb);
		Enemy e1 = new Enemy("drunk");
		Enemy e2 = new Enemy("homeless guy");
		Enemy e3 = new Enemy("Harry and Marv");
		Enemy e4 = new Enemy("pizza guy");
		Intro(kb);
		this.Combat(e1, p1, kb);
		Alleyway(kb);
		this.Combat(e2, p1, kb);
		CentralPark(kb);
		this.Combat(e3, p1,kb);
		PizzaParlor(kb, p1, e4);

	}

	public void Intro(Scanner kb) {
		Bar();
		System.out.println("\nYou’re in NYC on a Saturday night, inside some dive bar.");
		System.out.println("You’ve been bar hopping since you left Yankee Stadium.\n");
		Enter();
		kb.nextLine();
		System.out.println("Oh, man… How many beers and shots did I have?!");
		System.out.println("Wait, something is happening here…");
		System.out.println("What is this jabroni ranting about?\n");
		Enter();
		kb.nextLine();
		System.out.println("Looks like I spilled my beer on his Tims…");
		System.out.println("Guess it’s going to be another one of those Saturday nights.\n");
		Drunk();
//		System.out.println("Do you want to fight with this jabroni or get a boucer?");
		Enter();
		kb.nextLine();
	}

	public void Alleyway(Scanner kb) {
		System.out.println("\nLooks like we've been banned from another bar in the city.");
		System.out.println("That bouncer was a tool for kicking you out after railing that jabroni.");
		System.out.println("\nI'm freaking starving, after jacking that jabroni.");
		System.out.println("Let's go grab a slice.\n");
		Enter();
		kb.nextLine();
		System.out.println("So do we go to the east side or the west side, down that alley?");
		kb.nextLine();
		System.out.println("Well I guess we know where that smell came from...");
		Pickle();
		System.out.println("\nHomeless Guy: Wanna see my pickle jar collection?");
		System.out.println("I'm ThE PiCkLe KING, wHaTeVeR y0u g0t wE cAn pIcKlE iT!!!\n");
		System.out.println("Piss pants over here wants to fight you for walking down his alleyway\n");
		Enter();
		kb.nextLine();

	}

	public void CentralPark(Scanner kb) {
		System.out.println("How the hell did I end up in Central Park?");
		System.out.println("Great, street lights are going out around here.");
		System.out.println("Better get a slice before I get mugged.\n");
		Enter();
		kb.nextLine();
		MarvAndHarry();
		System.out.println("\nMarv: My how the tables have turned");
		System.out.println("Harry: Let's go for a lil stroll in the park\n");
		Enter();
		kb.nextLine();
		System.out.println("\n(Marv runs your pockets for cash)");
		System.out.println("(Harry slaps the back of your head with his billy club)");
		System.out.println("\n(Pigeon Lady shows up out of no where. ");
		System.out.println("Scares Harry and Marv but they still have your money)");
		System.out.println("Fight!\n");
		Enter();
		kb.nextLine();

	}

	public void PizzaParlor(Scanner kb, Player p1, Enemy e4) {
		PizzaGuy();
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
				Combat(e4, p1, kb);
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
				System.exit(0);
			} else if (comp.equals("P")) {
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
			} else if (comp.equals("R")) {
				System.out.println("Rock beats scissors - you lose!");
				System.out.println("Two Bits Tony: Hail to the Pizza King, baby!");
				System.exit(0);
			}
		}
	}

	public void Combat(Enemy villain, Player hero, Scanner kb) {
        boolean KO= false;
        System.out.println("\nThis " + villain.getName() + " wants to fight!");
        // set up combat options
        for (int i = 0; i < 1;) {
            while (true) {
                if (villainAttack(villain, hero)) {
                    System.out.println("WASTED");
                    System.exit(0);
                    break;
                }
                System.out.println("Keep wailing on him?(y/n)");
                if (kb.nextLine().toUpperCase().equals("Y")) {
                    if (heroAttack(villain, hero))
                        KO =true;
                        break;
                } else
                    i++;
                    KO = false;
                    System.out.println("Didn't realise I was a wuss!");
                    break;
            }
            // Grammar needs fixing
            if (KO) {
                i++;
                System.out.printf("\nYou won the fight with %d health left and got $%.2f from %s's pockets. %n",
                        hero.getHealth(), villain.getMoney(), villain.getName());
                hero.setMoney(hero.getMoney() + villain.getMoney());
                System.out.printf("You have $%.2f%n", hero.getMoney());
                
                Enter();
                kb.nextLine();
            }
        }
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

	public void Header(Scanner kb) {
		System.out.println("####################################################################");
		System.out.println("## #####  #####     ## ## #######################   |   ############");
		System.out.println("#  #### ## ###### #### ## ####################  \\   |   /  #########");
		System.out.println("## ####### ###### #### ## ##################     \\  |  /    ########");
		System.out.println("## #####  ####### ####    #################       \\ | /       ######");
		System.out.println("## ####### ###### #### ## #################________\\|/________######");
		System.out.println("#   ##    ####### #### ## #################        /|\\        ######");
		System.out.println("############################################      / | \\      #######");
		System.out.println("###############    ###     #     #     #######   /  |  \\    ########");
		System.out.println("############## #### #### ### ##### #### #########   |    ###########");
		System.out.println("############## ######### ### ##### #### ############################");
		System.out.println("############### ######## ### ##### #### ############################");
		System.out.println("################ ####### ###   ###     #############################");
		System.out.println("################## ##### ### ##### #################################");
		System.out.println("############## #### #### ### ##### #################################");
		System.out.println("############## #### #### ### ##### #################################");
		System.out.println("###############    ##### ###     # #################################");
		System.out.println("####################################################################\n\n\n");
	}

	public void Bar() {
		System.out.println("\n####################################################################");
		System.out.println("#    [ ]    [ ]    [ ]    [ ]    [ ]    [ ]    [ ]    [ ]    [ ]   #");
		System.out.println("#   /   \\  /   \\  /   \\  /   \\  /   \\  /   \\  /   \\  /   \\  /   \\  #");
		System.out.println("#   |xxx|  |xxx|  |xxx|  |xxx|  |xxx|  |xxx|  |xxx|  |xxx|  |xxx|  #");
		System.out.println("#   |___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|  #");
		System.out.println("#------------------------------------------------------------------#");
		System.out.println("#    [ ]    [ ]    [ ]    [ ]    [ ]    [ ]    [ ]    [ ]    [ ]   #");
		System.out.println("#   /   \\  /   \\  /   \\  /   \\  /   \\  /   \\  /   \\  /   \\  /   \\  #");
		System.out.println("#   |xxx|  |xxx|  |xxx|  |xxx|  |xxx|  |xxx|  |xxx|  |xxx|  |xxx|  #");
		System.out.println("#   |___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|  #");
		System.out.println("#------------------------------------------------------------------#");
		System.out.println("#__________________________________________________________________#");
		System.out.println("#    _________       _________       _________       _________     #");
		System.out.println("#   [_________]     [_________]     [_________]     [_________]    #");
		System.out.println("#       | |             | |             | |             | |        #");
		System.out.println("#       | |             | |             | |             | |        #");
		System.out.println("#       | |             | |             | |             | |        #");
		System.out.println("#       | |             | |             | |             | |        #");
		System.out.println("#       | |             | |             | |             | |        #");
		System.out.println("####################################################################\n\n\n");
	}

	public void Enter() {
		System.out.println("•••••••••••••••••••••••••••••••");
		System.out.println("•  PRESS ENTER TO CONTINUE... •");
		System.out.println("•••••••••••••••••••••••••••••••");

	}

	public void Wasted() {
		System.out.println("  ____      ____  _       ______   _________  ________  ______    ");
		System.out.println(" |_  _|    |_  _|/ \\    .\' ____ \\ |  _   _  ||_   __  ||_   _ `.  ");
		System.out.println("   \\ \\  /\\  / / / _ \\   | (___ \\_||_/ | | \\_|  | |_ \\_|  | | `. \\ ");
		System.out.println("    \\ \\/  \\/ / / ___ \\   _.____`.     | |      |  _| _   | |  | | ");
		System.out.println("     \\  /\\  /_/ /   \\ \\_| \\____) |   _| |_    _| |__/ | _| |_.' / ");
		System.out.println("      \\/  \\/|____| |____|\\______.'  |_____|  |________||______.'  ");

	}

	public void MarvAndHarry() {
		System.out.println(
				"XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXNNNNNNNNNNNNXXXXXXXXXXXXXXXXXXXXXXXXXNXXXNNXNNNNNXXXNNXK0kkOKXXNNNNNNNNXNNNNNNNNNNNNNXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println(
				"XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXXXXXXXXXXXXXXXXXXXNNXNNNXXNNNXK0kOOkxdoc::clodxxxOKKKXXNNNNNNNNNNNNNNNXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println(
				"XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXXXXXXXXXXXXXXXXXXNNNNNXKK0Oxdl:;;cc;,'.',;;;,;:ldkkkddokXNNNNNNNNNNNNNNXXXXXXXXXXXXXXXXXXNNNN");
		System.out.println(
				"XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXXXXXXXXXXXXXXXXNNNNXOkoc:;,'.....'........',;:loolcc:;l0NNNNNNNNNNNNNNNNXXXXXXXXXNNXXXXXNNNN");
		System.out.println(
				"XXXXXXXXXXXXXXXXXXXXXXXXXXNXXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXXXXXXXXXXXXNNNNNXKOoc:;,......................''''';::ldkXNNNNNNNNNNNNNNNNNNNNNNNNNNXXNNNNNN");
		System.out.println(
				"XXXXXXXXXXXXXXXXXXXXXXXXXXNNNNNNNXNXXKKKKKKKXNNNNNNNNNNNNNNNNNNNNNNNXXXXXXXXXXXXNNXOdlc;,''.............................',:::lkO0XNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
		System.out.println(
				"XXXXXXXXXXXXXXXXXXXXXXXNNNNNNNKkoc::;;,,,,,;:ok0XNWNNNNNNNNNNNNNNNNNNNNXXNNNXXXXXX0o;;,'....................................',,;;cONNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
		System.out.println(
				"XXXXXXXXXXXXXXXXXXXXXNNNNNNNXx:'...............':ok0XNWNNNNNNNNNNNNNNNNXXNNNXXXK0Oo;,'.........................................,,,ckXNNNNNNNNNNNNNNNNNNNNNNNNNNN");
		System.out.println(
				"XXXXXXXXXXXXXXXXXXNNNNNNNKkd:......................';lxKNWNNNNNNNNNNNNNNNNNNXX0xdl::;'............... ..........................';;;dXNNNNNNNNNNNNNNNNNNNNNNNNNN");
		System.out.println(
				"XXXXXXXXXXXXXXXXXXNNNNNXx;.............................,oKWNNNNNNNNNNNNXNNXNX0xolc:,''.........................'''''..............',:xXNNNNNNNNNNNNNNNNNNNNNNNNN");
		System.out.println(
				"XXXXXXXXXXXXXXXXNNNNNN0l'................................:OWNNNNNNNNNNNNNNNNX0kkkxl,.........................',;::::;'.............,,;xXNNNNNNNNNNNNNNNNNNNNNNNN");
		System.out.println(
				"XXXXXXXXXXXXXXXNNNNNN0c...................................;OWWNNNNNNNNNNNNNXK0Oxoc,......................',;;::clllcc:,...............c0NNNNNNNNNNNNNNNNNNNNNNNN");
		System.out.println(
				"XXXXXXXXXXXXXNNNNNNNXl.....................................;dOXNNNNNNNNNNNNXkkOoc:,'.................',;;:ccllllllllcc:,..............;kNNNNNNNNNNNNNNNNNNNNNNNN");
		System.out.println(
				"XXXXXXXXXXXXNNNNNNNNk,................   ....................,kNNNNNNNNNNNNX0xoc:;,'..............';:clooooooooollllcc:,..............:ONNNNNNNNNNNNNNNNNNNNNNNN");
		System.out.println(
				"XXXXXXXXXXXNNNNNNNNKl.................      ..................oNWNNNNNNNNNNXOoc;;,'.....'''..',;:cldkkkkkkkxxddollllcc:,..............:ONNNNNNNNNNNNNNNNNNNNNNNN");
		System.out.println(
				"XXXXXXXXXXXNNNNNNNNk,..................        ...............cKWNNNNNNNNNNKdc:;;,'....':ccccoddxxkOOOOOOkkxddooollllc:;'............'oKNNNNNNNNNNNNNNNNNNNNNNNN");
		System.out.println(
				"XXXXXXXXXXNNNNNNNNXo.................... ......  .............;0WNNNNNNNNNNN0ocodl;'...,cooddxkkkkOOOOOkkkxxdddooooolc:;,''..........c0WNNNNNNNNNNNNNNNNNNNNNNNN");
		System.out.println(
				"XXXXXXXXXXNNNNNNNNXd'.........................................:0WNNNNNNNNNNNN0xxxdl,...':ooddxkkkkkkkkkkkkkxxxxdddooolc:;,;;'.......;kNWWWWWNNNNNNNNNNNNNNNNNNNN");
		System.out.println(
				"XXXXXXXXXXNNNNNNNXOdc,''';clllllllcc:;,'......................lXWNNNNNNNNNNNNXOxddl;'...,coddxxxkkkkkkkkkkkkkkxxddolc:;,,;;:;'.....,xNWWWWWWWWWWNNNNNNNNNNNNNNNN");
		System.out.println(
				"XXXXXXXXXNNNNNNNNKxdxdc';lodddxxxxkkkkxxdlc:;,'..............'xNNNNNNNNNNNNNNNKdcc;,''...;lodddxkkkkOkkkkkkkxxxdolc:;,,,,:::;,....',oKNWWWWWWWWWWWNNNNNNNNNNNNNN");
		System.out.println(
				"XXXXXXXXNNNNNNNNWKxdxxl;coddxxxxxkkkkOOkkkxkkxdlc:;'.........cKWNNNNNNNNNNNNNNN0kxl:,'...':oddxxkkkkkkkkkxxxddl:;;,,;;,;cllc;,'...,;,,:ox0XWWWWWWWWNNNNNNNNNNNNN");
		System.out.println(
				"XXXXXXXXNNNNNNNNWXxdddocoddddoooooxkkkkkkkxkkkdoolc:;,'..''.;kNNNNNNNNNNNNNNNNNNNNKxl;''''':oddxxxxxxxxxxxxdl:;;colclccoddol:,''..''....',:d0NWWWWWWNNWWNNNNNNNN");
		System.out.println(
				"XXXXXXXXNNNNNNNNWXkddddodxxxdlc:;,,:cldxxxxxxxdolcc:;;'',;,;xNNNNNNNNNNNNNNNNNNNNNNX0o;,,;::clcclc::::cldkkdc:lddooooodddool:,''..........'',l0NWWWWWWWWWWNNNNNN");
		System.out.println(
				"XXXXXXXNNNNNNNWWWNOdddooodxxxxddoccc::coxkxoc::;,'''''',::;dXWNNNNNNNNNNNNNNNNNNNNNNN0kdxkkkoclc:cc,;cooddxxlcldddxxxxxxdoolc;,'...........''';oKWWWWWWWWWWWNNNN");
		System.out.println(
				"XXXXXXNNNNNNNWWWWXkdxdooodxkkkkkxdolldxxkkd;',clc;;,..'':;lKWWWWNNNNNNNNNNNNNNNNNNNNNNNXNNK0kddolodoooodxdxxocllloxxkxxxdoolc;,'.............''':xXWWWWWWWWWWWWW");
		System.out.println(
				"XXXXXNNNNNNWWWNKx:,;llooodxkkkkkxxddxxxxxxl,':oooc:,,;,;::kWWNWWNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXOddddodddxxddxdlccccldxxxdooolc:,'....   ........'',l0NWWWWWWWWWWW");
		System.out.println(
				"XXXXXNNNNNWWN0o;'....,looddxkkkkkkkkxxkxxxl,.;colllllc;c:lKWNWWNWWWNNNNNNNNNNNNNNNNNNNNNNNNNNNXOxdxxxxkkxdodkdlcllclddddoooolc;'....    ........''';dXWWWWWWWWWW");
		System.out.println(
				"XXXXNNNNX0kdc,'......'loodddxkkkkkxdddxxxxl,.,cooool:;;cd0NWNWWWWWWWWWNNNNWWWNNNNNNNNNNNNWNNWNWN0kddxxkkxxdoxkdlc:,;oddoooddoc;'...     ...........''lKWWWWWWWWW");
		System.out.println(
				"XXNXXKOxl;,,''.......,codddddxxxdoddxddxxdo;..;ool:,',:kNWWWWNWWWWWWWWNNWWWWWWNNNNNNNNNNWWNWNNWWN0xddxxxkkxdoddl;.':ccc::::loc;'..  .   .............':OWWWWWWWW");
		System.out.println(
				"xxxdl:;,,''''........;codddddddddxxxdxxxdol,...;c:,'',c0WWWWWWWWWWWWWWWWWWWWWWNWWWNNNNNWWNNWWWWWWXdloddxxxxxdlc;',:;,,;:clccll:'.. ....................;xKKXXNNW");
		System.out.println(
				"''''''''''''.........:clodddddddddddddddol;.....;;'.',,oXWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWN0l;;cloddxdooc:;;:c::clllooool;'. ......................',,,;:cc");
		System.out.println(
				"......''''''........'clccldoddolodoodoollc;'...,:;..'..,xNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWXd;..',;:cooc;;::::loolclloool:;'.. ..............................");
		System.out.println(
				"....''''..''......,,':llcccloooodddddolc:;''.':l:'......:0WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNOc'.....''',:;;coooooolcclodoo:,........'''....................    ");
		System.out.println(
				"....''''...... . .:c'';lllc:clodddddolcc:;;,,;:;.........lXWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNd;'............,clddddddoooolc:'.........','.....................   ");
		System.out.println(
				"...'''........ ...:l:'.;loolcccoodddooolccc:,'..... .....'xWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWXo,................';:ccllcccc:,'.........,;;......................   ");
		System.out.println(
				"...''''.'....  ...;ll:'.:lolccccllllllllc;,'..   . .......:0WWWWWWWWWWWWWWWWWWWWWWWWWWWWW0c'.....................''',;;,'.........',::,.....................    ");
		System.out.println(
				".............  ...'c:;:;,;cclodddolc:;,,'...     . .......':xKWWWWWWWWWWWWWWWWWWWWWWWWWW0c'...................',,'...'.........',;:cl:..........                ");
		System.out.println(
				".......'....    . .,..;cc;,:cc:;;;,',;,..   ....  .........',;dXWWWWWWWWWWWWWWWWWWWWWWW0c'....................,cccccc:,,'''',,;cclol:'......                    ");
		System.out.println(
				"..'''''....        ...:llc:;:;;;;,'',;'.   ..... ..........''.':xKWWWWWWWWWWWWWWWWWWWW0:'.....................;looodddollcccllodxdl,......                      ");
		System.out.println(
				".''''''....        ..'colc;;:c:::;;c;'.    ......'.....','..'...':dKNWWWWWWWWWWWWWWWWKl'.......'..............;xxddddxxxxxddxxkkdc......                        ");
		System.out.println(
				".''''......        .''coc:;,;;;;,';'.    ................''''....',:d0NWWWWWWWWWWWWWNo'..........       ......'d0OkxxxkkkkkkkOOo,...                            ");
		System.out.println(
				".''''.....         .,':c:;;;,,,....     ...... ............''....''',;o0WWWWWWWWWWWWk;........    .      ..  ..,x00OOkkkOOOOOOd'...                             ");
		System.out.println(
				".'.''.....         ','::;;,;;;......   ...'.   .............'.....'.'''c0WWWWWWWWWMNo'........  ....     ..  ...ck0KK0OkOOOOOx;..                               ");

	}
	
	public void Drunk() {
		System.out.println("                               .:AMMO:");
		System.out.println("                      .:AMMMMMHIIIHMMM.");
		System.out.println("              ....   .AMMMMMMMMMMMHHHMHHMMMML:AMF");
		System.out.println("            .:MMMMMLAMMMMMMMHMMMMMMHHIHHIIIHMMMML.");
		System.out.println("                  WMMMMMMMMMMMMMMMMMMH:::::HMMMMMMHII:.");
		System.out.println("            .AMMMMMMMHHHMMMMMMMMMMHHHHHMMMMMMMMMAMMMHHHHL.");
		System.out.println("          .MMMMMMMMMMHHMMMMMMMMHHHHMMMMMMMMMMMMMHTWMHHHHHML");
		System.out.println("        .MMMMMMMMMMMMMMMMMMMHHHHHHHHHMHMMHHHHIII:::HMHHHHMM.");
		System.out.println("        .MMMMMMMMMMMMMMMMMMMMMMHHHHHHMHHHHHHIIIIIIIIHMHHHHHM.");
		System.out.println("        MMMMMMMMMMMMMMMMMHHMMHHHHHIIIHHH::IIHHII:::::IHHHHHHHL");
		System.out.println("         MMMMMMMMMMMMMMMMHIIIHMMMMHHIIHHLI::IIHHHHIIIHHHHHHHHML");
		System.out.println("          .MMMMMMMMMMMMMM WMMMHHHMMMMMMMMMMMLHHHMMMMMMHHHHHHHHHHH");
		System.out.println("         .MMMMMMMMMMMWWMW   \"\"YYHMMMMMMMMMMMMF\"\"HMMMMMMMMMHHHHHHHH.");
		System.out.println("        .MMMMMMMMMM W\" V                         W\"WMMMMMHHHHHHHHHH");
		System.out.println("        MMMMMMMMMM\".                                 \"WHHHMH\"HHHHHHL");
		System.out.println("       MMMMMMMMMMF  .                                         IHHHHH.");
		System.out.println("       MMMMMMMMMM .                                  .        HHHHHHH");
		System.out.println("       MMMMMMMMMF. .                               .  .       HHHHHHH.");
		System.out.println("       MMMMMMMMM .     ,AWMMMMML.              ..    .  .     HHHHHHH.");
		System.out.println("     :MMMMMMMMM\".  .  F\"'    \'WM:.         ,::HMMA, .  .      HHHHMMM");
		System.out.println("     :MMMMMMMMF.  . .\"         WH..      AMM\"'     \"  .  .    HHHMMMM");
		System.out.println("      MMMMMMMM . .     ,;AAAHHWL\"..     .:'                   HHHHHHH");
		System.out.println("      MMMMMMM:. . .   -MK\"OTO L :I..    ...:HMA-.             \"HHHHHH");
		System.out.println(" ,:IIIILTMMMMI::.      L,,,,.  ::I..    .. K\"OTO\"ML           'HHHHHH");
		System.out.println("LHT::LIIIIMMI::. .      '\"\"'.IHH:..    .. :.,,,,           '  HMMMH:HLI'");
		System.out.println("ILTT::\"IIITMII::.  .         .IIII.     . '\"\"\"\"             ' MMMFT:::.");
		System.out.println("HML:::WMIINMHI:::.. .          .:I.     .   . .  .        '  .M\"'.....I.");
		System.out.println(" HWHINWI:.'.HHII::..          .HHI     .II.    .  .      . . :M.',, ..I:");
		System.out.println("  MLI\"ML': :HHII::...        MMHHL     :::::  . :..      .'.'.'HHTML.II:");
		System.out.println("   MMLIHHWL:IHHII::....:I:\" :MHHWHI:...:W,,\"  '':::.      ..'  \":.HH:II:");
		System.out.println("     MMMHITIIHHH:::::IWF\"    \"\"\"T99\"'  '\"\"    '.':II:..'.'..'  I'.HHIHI'");
		System.out.println("      YMMHII:IHHHH:::IT..     . .   ...  . .    ''THHI::.'.' .;H.\"\".\"H\"");
		System.out.println("        HHII:MHHI\"::IWWL     . .     .    .  .     HH\"HHHIIHHH\":HWWM\"");
		System.out.println("         \"\"\" MMHI::HY\"\"ML,          ...     . ..  :\"  :HIIIIIILTMH\"");
		System.out.println("              MMHI:.'    'HL,,,,,,,,..,,,......,:\" . ''::HH \"HWW");
		System.out.println("              'MMH:..   . 'MMML,: \"\"\"MM\"\"\"\"MMM\"      .'.IH'\"MH\"");
		System.out.println("                \"MMHL..   .. \"MMMMMML,MM,HMMMF    .   .IHM\"");
		System.out.println("                  \"MMHHL    .. \"MMMMMMMMMMMM\"  . .  '.IHF'");
		System.out.println("                    'MMMML    .. \"MMMMMMMM\"  .     .'HMF");
		System.out.println("                     HHHMML.                    .'MMF\"");
		System.out.println("                    IHHHHHMML.               .'HMF\"");
		System.out.println("                    HHHHHHITMML.           .'IF..");
		System.out.println("                    \"HHHHHHIITML,.       ..:F...");
		System.out.println("                     'HHHHHHHHHMMWWWWWW::\"......");
		System.out.println("                       HHHHHHHMMMMMMF\"'........");
		System.out.println("                         HHHHHHHHHH............");
		System.out.println("                          HHHHHHHH...........");
		System.out.println("                           HHHHIII..........");
		System.out.println("                             HHIII..........");
		System.out.println("                               HII.........");
		System.out.println("                                \"H........");
		System.out.println("                                  ......	");	
	}
	
	public void Pickle() {
		System.out.println("```````````````````````````mssshs-``````````````````````````-yd/```````````````````-+ymMMMMMMMMMMMMM");
		System.out.println("``````````````````````````.Nsyooshs.```````````````````````ohsy/```````````````````````./shNMMMMMMMM");
		System.out.println("``````````````````````````.Nysssoosho.```````````````````-hsooy/````````````````````````````-+ymMMMM");
		System.out.println("```````````````````````````moossossssho-```````````````-sho+++y/````````````````````````````````./sh");
		System.out.println("```````````````````````````hyooosyssysydy:```````````/yysssssoso````````````````````````````````````");
		System.out.println("```````````````````````````+Noosssyysysyyhy-```````:hyyoossssooy````````````````````````````````````");
		System.out.println("```````````````````````````.Nyssssyoyoyysyyho.```.sdssssoosyyssd````````````````````````````````````");
		System.out.println("``-:.```````````````````````omssosssssyyyyyyhh/`-dyosysosssyssyd-```````````````````````````````````");
		System.out.println("``.+hyso/:-.````````````````.mhhysssysysysyyyyysmssosysooossssyho```````````````````````````````````");
		System.out.println("````-ohyoysyyss+/:-.`````````+msyyyyysyyyssysssyyosysoyoooossoysd```````````````````````````````````");
		System.out.println("``````-oyosyysssyyyyyyo+/:-.`.myosyyhyssssyyosssyssssoooooooosyhd/``````````````````````````````````");
		System.out.println("````````-sdyyyhysssssyhhhhddyomhsssssssssyyyhhyyyyyyyhsoosssyydysh``````..--::/o:+ossy``````````````");
		System.out.println("``````````:yhhhssosyssyyyyhhhhhssyssosyhys+/:-------:/+sysyysysosdo+ooosysssysdhoyysh/``````````````");
		System.out.println("```````````.omyysyssoyyyyyyhyydosyshhs:-.````````````````.-/sysyyyssssosyssyyyhds+oos```````````````");
		System.out.println("`````````````+myssssoyhhyhhysshosyhy/.````````...````````````.:ohyssyyoyhyyyysdddsoss:-`````````````");
		System.out.println("``````````````/ddhssoyssyysssyyshd+..````````.-::--::----```````-ohyyyoyyyyyyhddmds`````````````````");
		System.out.println("```````````````:hhhhyssysyyyhyyhm:``````.--.-/+ooooo+++//---``````-ohysyhyyyydmdmhy`````````````````");
		System.out.println("````````````````.ydhyhyyyysysyhms`..--.-://///+//////:////::---..```-yhysssyhhhyhN``````````````````");
		System.out.println("`````````````````.+dhyyhysyyhyhm.ssssoo+/:://:--::::::////++++o++/:-..ohssssysssh```````````````````");
		System.out.println("```````````````````:yysyyyhhhhm+.+yyyyyyyyhyssssyyyyyyhyhhyhyysssyyyso`ysoosssyhm:``````````````````");
		System.out.println("```````````````````.-ydyyyhhdmm.``.-://++oossyshyyyyyysoo++/::::/ossss`-dyssoosdo.``````````````````");
		System.out.println("``--...----:://+osyhddhhhyyyyms`.-o::://--::::+/-```.````..`.--......```+dsssshdy```````````````````");
		System.out.println("`./sdyyhhdmhhhyhhhNdyyhhhhyyym-.ss+++++//::://osh+`````.+ys/:::::/+ss/.``hssyyyss```````````````````");
		System.out.println("````.+yhsydssssshmhdyyysyhyhhh`yyo++/+oossoooosssys````hh++++++ooo+/+os/`:dhhhssyhhdhdNmhyooo```````");
		System.out.println("```````-ohdsshshyhhysssyyhyym+:Ndhhysssssy+sssooosho``odo+ooooosooossssho`hhhyshyyyhhyhNmhy`````````");
		System.out.println("``````````/ymdssdshhyhhhyyyoN:/mso+/+/::dNs::::///+m``yy+/+////oNh///+ooh-/hsysyyyyyyyymN```````````");
		System.out.println("````````````.+yhyshyyhyhhsssN-.h-````````-````````:N``oy````````-.``````:o.dssssshsyymh`````````````");
		System.out.println("```````````````:sdhhhhhshhhyN.-+h-```````````````.dy``.N+```````````````/o.yyssoyyyyds``````````````");
		System.out.println("`````````````````-sdssyhhyyyN.`:yds-````````````-hN-```+No`````````````.h+-:dsssssyh................");
		System.out.println("```````````````````:dysssysyN```-sdmh/-``````.+ymmo````.sMd/``````````:ho+:`dsssssyhh+..............");
		System.out.println("````````````````````.NysssyyN````./soshhyyyyhdddh:y:````+yyNms+:-:/+sdd+/.``dso++sssssh+............");
		System.out.println("```````````````````-hhos+o+oN.``:o../o++ooo//:/o.`No````m:-./shddhhyo/::-```msooooyssossho-.-......`");
		System.out.println("```````````````-/oydyyso+oydN-``./yho+/::/+ossh+``ms````M:.oo/:-://+ooss.```Ndyssyysossssyhs:-......");
		System.out.println("``````````./oyddhyyyhsyydNmmm-`````.-:ooso/:-.````hs```.M-``-:ooosso+/-`````MNNmysoossyyyydho.-.....");
		System.out.println("``````:oyddyssyyyyyyyhymNmddd+````````...`````````yd```-M.`````````````````.NmmNNhssyyhys+-.....-...");
		System.out.println("``````./yddsosshyyyyyhhMydhhdy`.``````````.```````:N/``sm``````````````````-mmdy+msys+-.````........");
		System.out.println("````````..:osyymmdhhhhhN+:yydm..```````````````````:ysyy-``````````````````:mms-ydyh.````````.....-`");
		System.out.println("````````````...-:/++oyNhms+osM-````````````..```````.::````````````````````+msoymssyy``````````....-");
		System.out.println("`````````````````````odssyhdhN+..`````..```````````````````````````````-```sddddyyyyhs.`````````....");
		System.out.println("````````````````````.msoosssymy....-/...`````.-:/++oooo+/::-.``````````/y.`hsssyysyyyhs`````````....");
		System.out.println("````..``````````````shsssssyydm.../y:...-/+yhhhNmdydyyhhysymyyyys+/:-```y+.myossyysssoyo``````````..");
		System.out.println("``.`........```````-myyyyyyyysN/..d-.-yhys+:-../hy/oyoo::+s+..--:+osy-``o+omyyyyyyssyyyh:``````````.");
		System.out.println("...................sdhhhyyyyhhmd..ys-./-..``````./y+hy-+d/.`````````.::+s-Nhsd:--....---.```````````");
		System.out.println("................../NdmmmdhhhyyMM+.-+ss/......`````.hd+.yo``.`````````//:.smhyy+`````````````````````");
		System.out.println("..................yhyo+::--..sMmN:...-........`````oy/-ss`yd-```````````:Nhyssh`````````````````````");
		System.out.println(".............................mmhNm:..............``.yo/d+./+.``````````.dysyyyd-````````````````````");
		System.out.println(".............................Ndhddd:..............`../Nh.`````````````.s+```.--.````````````````````");
		System.out.println(".............................dho/-:yo-..............``:-......```````.s+````````````````````````````");
		System.out.println("....................................oy/-...................`....`.`.:s/.````````````````````````````");
		System.out.println(".....................................-syo-..................`.`...:so.``````````````````````````````");
		System.out.println(".......................................:ohs/:-................-/oo+-````````````````````````````````");
		System.out.println("..........................................:hNdhs/:------://oyyo/-`..`````.``````````````````````````");
		System.out.println("..........................................-mmmmNNNmmdmmdmdshN/........```..`.```````````````````````");
		System.out.println(".............-............--.......----:/+shsyyddddhhhyyho++d-............``````````````````````````");
		System.out.println("........-------..........------:/osssos+/shys+syoydhysss++:-d.............``````````````````````````");
		System.out.println(".......-----------..--.---:+syss+/-.-so-/h-.:oyyyss++/oooosymyo:............````.```````````````````");
		System.out.println("-.--------------------:+yyyo:------:h+--d:.....-/++ooooo++:.m:/sss+-..........``````````````````````");
		System.out.println("-------------------/sys+:---------+h:-.so...................h/.y/./ss/........``````````````````````");
		System.out.println("----------------oyyo:------------ys---:d--..................y+.:d..../ss:........``....`````````````");
		System.out.println("--------------ydo--------------/d+----h+--..................h/..y/.....-+s/.........`....```````````");
	}
	
	public void PizzaGuy() {
		System.out.println("		                          .:///////////:                                                            "); 
		System.out.println("		                     `///:`           -s.                                                           ");
		System.out.println("		                  `/+:`                `h                                                           ");
		System.out.println("		                -+/`                    h                                                           ");
	    System.out.println("		              :+-                      -o                                                           ");
	    System.out.println("		            :o-                       `y`                                                           ");
	    System.out.println("		          -o-                        `s`                                                            ");
	    System.out.println("		        `+/                         .s`                                                             ");
	    System.out.println("		       :o`                   ```...:y/                                                              ");
	    System.out.println("		     `o:                     /..`````//                                                             ");
	    System.out.println("		    :o`                     :.       -o                                                             ");
	    System.out.println("		   +/                     .:`         y`                                                            ");
	    System.out.println("		  o:         `/        `.-.           -s                                                            ");
		System.out.println("		 o:         .:`--....--.`              /o                                       ````                ");
		System.out.println("		:+         --                           :o`                              `-:/+ooooooooo+/:-`        ");
		System.out.println("		y`       .:`                       `...../h/                         `-/oo+oo+/++//::://++oso:`     ");
		System.out.println("		h      .+.                  `..---:oy+...-hNy--.                   -+o+/+////--hh+`/+oo//ss+oos+`   ");
		System.out.println("		+/` .://+//+`           `.-:-..```/hMMs/.`.mm///o.               -o/-/+++++//-+yh/.syyy+:oy/-+++s:  ");
		System.out.println("		 -:/:.`    s.        `.:-..```````.hNNs.```/:/::o:              +o--o/.yhhh+.`+o/--.oso`+ys/..++:y/ ");
		System.out.println("		           y`      .:-sdd+```.--::-:+/.--.``.h+/-              +s--ssos+o/.`/syh+.``shy--/+++/-o+/h-");
		System.out.println("		           +:    .:-``yMMM:-:-.``````-ddddyshM`               -h/-+o//ysyy/./o+/yoo++hh+.dhhyho-y/+y");
		System.out.println("		           `y  .:.```.+yys+-````````:yNNNNNNMh              -o/s/-s/``//:oyso:.`/ooyyyssoo+oo+-:y//h");
		System.out.println("		            :++o``````.`-oh/-..--/ohNMNNNNNNy`              d-.s:.+yoss:./yyhh+:sy:shhhhho`/sy:s//oy");
		System.out.println("		            `smm+``````:dmNNmmdmmNMdydddhdh-                d+:o/--hdhy+:.-+::-+oooos/--:/o++os+/+hs");
		System.out.println("		            s:/+:.`./+smmNNNNNNNNNy-``.-+s-`                s+/+s/::sohhh+:/.shhhs-:+:+ooo//o+//oyy+");
		System.out.println("		            +++/:o+::+ydmmNNNmmho:...--.`.-:+:.           ```/y+os+:-/ss+-/os///oyy-.:hdds+/--+sys/`");
		System.out.println("		             .---` -/so//++///:----...--     -:+-`../-.../+/osssosyo/:-/++oyho//oyho++//::-:+yyo-   ");
		System.out.println("		                 .//:-`   ````       .-:..     `:+/-`-o++y-:s+:/h:+ssoo+//::://::---:://+syyo-`     ");
		System.out.println("		               -+:`                    `//.`     `::-/+ooosy--:so  `-/oooooooooooooosssys/-`        ");
		System.out.println("		             .o:                         --/  ``-/+ooo+:o-:+/s/-       .:/osssoossss+/-`            ");
		System.out.println("		            .s`         -                 --:/+oooo/-::`.oo:-.              `.--..`                 ");
		System.out.println("		            s.          -:            `.:/+o+oo+:......-os`                                         ");
		System.out.println("		            y           -/:.`    ``-:/+o++/:-````..-----++`                                         ");		            
		System.out.println("		            //        `::``---/:/+ooooo+:--.....``       :o                                         ");
		System.out.println("		             /+`    `-:.``````:so+/:-.``                  /+                                        ");
		System.out.println("		              `///-++:...````.-o.``                        s.                                       ");
		System.out.println("		                `.+oyyoos+-+://.                           -s                                       ");
		System.out.println("		            `-/ooso+ossdNmmN.                               h                                       ");
		System.out.println("		           -ddoooss+:`.Nmmmy                            ```:y.                                      ");
		System.out.println("		           `yhy+:.   `dmmmNo-````             `````.-/oshdNN`                                       ");
		System.out.println("		                    `hNmmmmNNNmdhhyy+/////////hdmmNNNNNNNNmN`                                       ");
		System.out.println("		                   `hNmmmmmmmmmmNNNm`        .NNNNmmmmmmmmmN-                                       ");
		System.out.println("		                   hNmmmmmmmmmmmNNm.         .dNNmmmmmddhhhhdh`                                     ");
		System.out.println("		                  `ymddhddmNNmmNNh`           +dNNNNmhhhhhhddNd/                                    ");
		System.out.println("		                 +dmdhhhhdmmNo:-.            -mdmmmddddddmddmmdm                                    ");
		System.out.println("		                `Nddddmmmmmmmm/               `/oyddhhhhhdhyso:`                                    ");
		System.out.println("		                 -+syyhhhhdhyo`                     `````                                           ");
	}
}
