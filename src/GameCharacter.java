
public class GameCharacter {
	private int health;
	private double money;
	private int skill;
	private int strength;
	private String name;
	
	public GameCharacter(String name) {
		this.name = name;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public int getSkill() {
		return skill;
	}
	public void setSkill(int skill) {
		this.skill = skill;
	}
	public int attack(int strength) {
		return strength*2;
	}
	public int damage(int attack, int skill) {
		return attack-skill;
	}
	public boolean deathCheck(int health) {
		if (health>0)
			return false;
		else
			return true;
	}
}
