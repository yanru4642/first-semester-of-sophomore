public class Warrior extends Role{
	//contructor
	public Warrior(){
		super();
	}
	public Warrior(String name, int life, int magic){
		super(name,life,magic);
	}
	//attack
	public void NewMoon(Warrior w) {
		if (this.getMagic()<10) {
			System.out.printf("魔力不足，攻擊無效%n");
		}else {
			this.setMagic(this.getMagic()-10);
			System.out.printf("%s攻擊%s%n",this.getName(),w.getName());
			w.setLife(w.getLife()-25);
		}
		if (w.getLife()<=0) {
			System.out.printf("%s被%s打死了%n",w.getName(),this.getName());
			System.exit(0);
		}
	}
	public void NewMoon(Mage m) {
		if (this.getMagic()<10) {
			System.out.printf("魔力不足，攻擊無效%n");
		}else {
			this.setMagic(this.getMagic()-10);
			System.out.printf("%s攻擊%s%n",this.getName(),m.getName());
			m.setLife(m.getLife()-40);
		}
		if (m.getLife()<=0) {
			System.out.printf("%s被%s打死了%n",m.getName(),this.getName());
			System.exit(0);
		}
	}
	//toString
	@Override
	public String toString() {
		return ("戰士名:"+getName()+"  Life:"+getLife()+"  Magic"+getMagic());
	}
	
	
}
