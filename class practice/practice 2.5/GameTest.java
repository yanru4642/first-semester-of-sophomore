import java.security.SecureRandom;

public class GameTest {
	public static void main(String[] args) {
		SecureRandom randomNumber = new SecureRandom();
		//initialize 3 warriors and 3 mages
		Role[] roleList=new Role[6];
		for (int i = 0; i < 6; i++) {
			if(i<3) {
				roleList[i]=new Warrior("戰"+(i+1), 400, 100);
			}else {
				roleList[i]=new Mage("法"+(i-2), 280, 200);
			}
		}
		//show 3 warriors and 3 mages
		for (Role role : roleList) {
			System.out.println(role);
		}
		//fight
		while (true) {
			//pick 2 characters randomly
			int a;
			int b;
			do {
				a=randomNumber.nextInt(6);
				b=randomNumber.nextInt(6);
			} while (a==b);
			if(roleList[a] instanceof Warrior) {
				//a warrior attack a mage
				Warrior aWarrior = (Warrior)roleList[a];
				aWarrior.NewMoon(roleList[b]);
			}else {
				//a mage attack a warrior
				((Mage)roleList[a]).SmallFire(roleList[b]);	
			}
			
		}//fight
		
	}
}
