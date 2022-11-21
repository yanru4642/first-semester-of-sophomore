public class Mage extends Role{
	//constructor
	public Mage(){
		super();
	}
	public Mage(String name, int life, int magic){
		super(name,life,magic);
	}
	//attack
	public void SmallFire(Warrior w) {
		if (this.getMagic()<25) {
			System.out.printf("魔力不足，攻擊無效%n");
		}else {
			this.setMagic(this.getMagic()-25);
			System.out.printf("%s攻擊%s%n",this.getName(),w.getName());
			w.setLife(w.getLife()-40);
		}
		if (w.getLife()<=0) {
			System.out.printf("%s被%s打死了%n",w.getName(),this.getName());
			System.exit(0);
		}
	}
	public void SmallFire(Mage m) {
		if (this.getMagic()<25) {
			System.out.printf("魔力不足，攻擊無效%n");
		}else {
			this.setMagic(this.getMagic()-25);
			System.out.printf("%s攻擊%s%n",this.getName(),m.getName());
			m.setLife(m.getLife()-60);
		}
		if (m.getLife()<=0) {
			System.out.printf("%s被%s打死了%n",m.getName(),this.getName());
			System.exit(0);
		}
	}
	//toString
	@Override
	public String toString() {
		return ("法師名:"+getName()+"  Life:"+getLife()+"  Magic"+getMagic());
	}
	
	
}
