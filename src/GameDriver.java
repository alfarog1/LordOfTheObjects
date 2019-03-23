
public class GameDriver {

	
	public GameDriver(Scanner kb) {
		
	}
	
	public void RunGame() {
		System.out.println("Enter your name");
		String name = kb.next;
		Player p1 = new Player(name);
		Intro();
	}
	
	public String Intro() {
		System.out.println("You’re in NYC on a Saturday night, inside some dive bar. You’ve been bar hopping since you left Yankee Stadium. ");
		System.out.println("Press enter to continue...");
		kb.nextLine();
		System.out.println("Oh, man… How many beers and shots did I have?!");
		System.out.println("Wait, something is happening here…");
		System.out.println("What is this jabroni ranting about?");
		kb.nextLine();
		System.out.println("Looks like I spilt my beer on his Tims…");
		System.out.println("Guess it’s going to be another one of those Saturday nights.");
		System.out.println("Do you want to fight with this jabroni or get a boucer?");
		kb.nextLine();
	}
	
	public String Bar() {
		
	}
	
	
}

