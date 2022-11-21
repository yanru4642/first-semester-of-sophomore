import java.security.SecureRandom;

public class GameTest {
	public static void main(String[] args) {
		SecureRandom randomNumber = new SecureRandom();
		//construct 3 warriors and 3 mages
		Warrior[] warriors = new Warrior[3];
		Mage[] mages = new Mage[3];
		for (int i = 0; i < 3; i++) {
			warriors[i]=new Warrior("戰"+(i+1), 400, 100);
			mages[i]=new Mage("法"+(i+1), 280, 200);
		}
		//fight
		while (true) {
			//a warrior attack a mage
			warriors[randomNumber.nextInt(3)].NewMoon(mages[randomNumber.nextInt(3)]);
			//a mage attack a warrior
			mages[randomNumber.nextInt(3)].SmallFire(warriors[randomNumber.nextInt(3)]);	
		}
	
		
	}
}
