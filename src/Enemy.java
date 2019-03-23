
public class Enemy extends GameCharacter {
	public Enemy(String type) {
		
		super(type);
		
		if (type.equals("drunk")) {
			super.setHealth(15);
			super.setSkill(2);
			super.setStrength(10);
			super.setMoney(1.00);
		}
//		if (type.equals("bouncer")) {
//			super.setHealth(10);
//			super.setSkill(10);
//			super.setStrength(10);
//			super.setMoney(1.00);
//			
//		}
		if (type.equals("homeless guy")) {
			super.setHealth(30);
			super.setSkill(4);
			super.setStrength(7);
			super.setMoney(1.00);
			
		}
		if (type.equals("Harry and Marv")) {
			super.setHealth(50);
			super.setSkill(3);
			super.setStrength(10);
			super.setMoney(1.00);
			
		}
		if (type.equals("pizza guy")) {
			super.setHealth(70);
			super.setSkill(5);
			super.setStrength(10);
			super.setMoney(1.00);
			
		}
		
		
	}
}
