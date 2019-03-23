
public class Enemy extends GameCharacter {
	public Enemy(String type) {
		
		super(type);
		
		if (type.equals("drunk")) {
			super.setHealth(10);
			super.setSkill(10);
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
			super.setHealth(10);
			super.setSkill(10);
			super.setStrength(10);
			super.setMoney(1.00);
			
		}
		if (type.equals("pigeon lady")) {
			super.setHealth(10);
			super.setSkill(10);
			super.setStrength(10);
			super.setMoney(1.00);
			
		}
		if (type.equals("pizza guy")) {
			super.setHealth(10);
			super.setSkill(10);
			super.setStrength(10);
			super.setMoney(1.00);
			
		}
		
		
	}
}
