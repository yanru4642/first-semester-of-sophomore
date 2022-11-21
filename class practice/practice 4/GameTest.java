import java.security.SecureRandom;

public class GameTest {
	public static void main(String[] args) {
		SecureRandom randomNumber = new SecureRandom();
		// initialize 3 warriors and 3 mages
		Role[] roleList = new Role[6];
		for (int i = 0; i < 6; i++) {
			if (i < 3) {
				roleList[i] = new Warrior("戰" + (i + 1), 400, 80);
			} else {
				roleList[i] = new Mage("法" + (i - 2), 300, 30);
			}
		}
		// initialize drugs
		Drug[] redDrugs = new RedDrug[3];
		Drug[] blueDrugs = new BlueDrug[3];
		redDrugs[0] = new RedDrug("L", 120);
		redDrugs[1] = new RedDrug("M", 80);
		redDrugs[2] = new RedDrug("S", 50);
		blueDrugs[0] = new BlueDrug("L", 100);
		blueDrugs[1] = new BlueDrug("M", 60);
		blueDrugs[2] = new BlueDrug("S", 30);
		// show 3 warriors and 3 mages
		for (Role role : roleList) {
			System.out.println(role);
		}
		System.out.println("----------------------------");
		// fight
		while (true) {
			// pick 2 characters randomly
			int a;
			int b;
			// chance to drink drug
			int chance;
			do {
				a = randomNumber.nextInt(6);
				b = randomNumber.nextInt(6);
			} while (a == b);
			if (roleList[a] instanceof Warrior) {
				// a warrior attack a mage
				Warrior aWarrior = (Warrior) roleList[a];
				aWarrior.NewMoon(roleList[b]);
			} else {
				// a mage attack a warrior
				((Mage) roleList[a]).SmallFire(roleList[b]);
			}

			// drink blue
			if (roleList[a].getMagic() < 25) {
				chance = randomNumber.nextInt(10);
				if (chance == 0) {
					// L
					roleList[a].DrinkDrug(blueDrugs[0]);
					System.out.println(roleList[a].getName() + " drink L blue drug");
				} else if (chance >= 1 && chance <= 2) {
					// M
					roleList[a].DrinkDrug(blueDrugs[1]);
					System.out.println(roleList[a].getName() + " drink M blue drug");
				} else if (chance >= 3 && chance <= 6) {
					// S
					roleList[a].DrinkDrug(blueDrugs[2]);
					System.out.println(roleList[a].getName() + " drink S blue drug");
				} else {
					// no drug
					System.out.printf("%s no blue drug to drink%n", roleList[a].getName());
				}
			}
			// drink red
			if (roleList[b].getLife() < 80 && roleList[b].getLife() > 0) {
				chance = randomNumber.nextInt(10);
				if (chance == 0) {
					// L
					roleList[b].DrinkDrug(redDrugs[0]);
					System.out.println(roleList[b].getName() + " drink L red drug");
				} else if (chance >= 1 && chance <= 2) {
					// M
					roleList[b].DrinkDrug(redDrugs[1]);
					System.out.println(roleList[b].getName() + " drink M red drug");

				} else if (chance >= 3 && chance <= 6) {
					// S
					roleList[b].DrinkDrug(redDrugs[2]);
					System.out.println(roleList[b].getName() + " drink S red drug");
				} else {
					// no drug
					System.out.printf("%s no red drug to drink%n", roleList[b].getName());
				}
			}
			// die
			else if (roleList[b].getLife() <= 0) {
				System.out.printf("%s was killed by %s%n", roleList[b].getName(), roleList[a].getName());
				System.exit(0);
			}
			//recover life and magic
			if (roleList[a] instanceof Warrior) {
				roleList[a].setLife(roleList[a].getLife()+roleList[a].recoverLife());
				System.out.printf("%s回血%.1f", roleList[a].getName(),roleList[a].recoverLife());
			}else {
				roleList[a].setMagic(roleList[a].getMagic()+roleList[a].recoverMagic());
				System.out.printf("%s回魔%.1f", roleList[a].getName(),roleList[a].recoverMagic());
			}
			if (roleList[b] instanceof Warrior) {
				roleList[b].setLife(roleList[b].getLife()+roleList[b].recoverLife());
				System.out.printf(" %s回血%.1f%n", roleList[b].getName(),roleList[b].recoverLife());
			}else {
				roleList[b].setMagic(roleList[b].getMagic()+roleList[b].recoverMagic());
				System.out.printf(" %s回魔%.1f%n", roleList[b].getName(),roleList[b].recoverMagic());
			}
			System.out.println("----------------------------");
		} // fight
	}
}
