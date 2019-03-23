import java.util.Scanner;

public class Player extends GameCharacter {
//	set up Item object file
	
	public Player(String name,Scanner kb) {
		super(name);
		int statPoints=15;
		System.out.println("You start with 15 Stat Points, that you can divide between");
		System.out.println("Strength: a measure of how much damage you do per hit");
		System.out.println("Skill: a measure of how well you defend against attacks");
		System.out.println("Health: a measure of how much damage you can take before dying");
		System.out.println("press enter to continue");
		kb.nextLine();
		addStats(statPoints,kb);

		
	}
	public void addStats(int statPoints, Scanner kb) {
		System.out.println("you have "+statPoints+" Stat Points left");
		System.out.println("how many points would you like to put into Strength?");
		int strength=kb.nextInt();
		statPoints-=strength;
//		TODO set up check for valid entry
//		TODO set up check for has remaining points
		System.out.println("you have "+statPoints+" Stat Points left");
		System.out.println("how many points would you like to put into Skill?");
		int skill=kb.nextInt();
		statPoints-=skill;
//		TODO set up check for valid entry
//		TODO set up check for has remaining points
		System.out.println("you have "+statPoints+" Stat Points left");
		System.out.println("how many points would you like to put into Health?");
		int health=kb.nextInt();
		statPoints-=health;
//		TODO set up check for valid entry
//		TODO set up check for has remaining points
		setStrength(strength+5);
		setSkill(skill+3);
		setHealth(health*10+50);
		kb.nextLine();
	}
	

}