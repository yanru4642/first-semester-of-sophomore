public class Mage extends Role{
	//constructor
	public Mage(){
		super();
	}
	public Mage(String name, int life, int magic){
		super(name,life,magic);
	}
	//attack
	public void SmallFire(Role r) {
		if (r instanceof Warrior) {
			if (this.getMagic()<25) {
				System.out.printf("魔力不足，攻擊無效%n");
			}else {
				this.setMagic(this.getMagic()-25);
				System.out.printf("%s攻擊%s%n",this.getName(),r.getName());
				r.setLife(r.getLife()-40);
			}
			if (r.getLife()<=0) {
				System.out.printf("%s被%s打死了%n",r.getName(),this.getName());
				System.exit(0);
			}
		}else {
			if (this.getMagic()<25) {
				System.out.printf("魔力不足，攻擊無效%n");
			}else {
				this.setMagic(this.getMagic()-25);
				System.out.printf("%s攻擊%s%n",this.getName(),r.getName());
				r.setLife(r.getLife()-60);
			}
			if (r.getLife()<=0) {
				System.out.printf("%s被%s打死了%n",r.getName(),this.getName());
				System.exit(0);
			}
		}
	}
	//toString
	@Override
	public String toString() {
		return ("法師名:"+getName()+"  Life:"+getLife()+"  Magic:"+getMagic());
	}
}
