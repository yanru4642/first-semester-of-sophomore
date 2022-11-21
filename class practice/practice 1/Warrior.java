
public class Warrior {
	private String Name;
	private int Life;
	private int Magic;
	//contructor
	public Warrior(){}
	public Warrior(String name, int life, int magic){
		this.Name=name;
		this.Life=life;
		this.Magic=magic;
	}
	//set and get functions
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getLife() {
		return Life;
	}
	public void setLife(int life) {
		Life = life;
	}
	public int getMagic() {
		return Magic;
	}
	public void setMagic(int magic) {
		Magic = magic;
	}
	//attack
	public void NewMoon(Warrior w) {
		if (Magic<10) {
			System.out.printf("魔力不足，攻擊無效%n");
		}else {
			Magic-=10;
			System.out.printf("%s攻擊%s%n",Name,w.getName());
			w.setLife(w.getLife()-25);
		}
		if (w.getLife()<=0) {
			System.out.printf("%s被%s打死了%n",w.getName(),Name);
			System.exit(0);
		}
	}
	public void NewMoon(Mage m) {
		if (Magic<10) {
			System.out.printf("魔力不足，攻擊無效%n");
		}else {
			Magic-=10;
			System.out.printf("%s攻擊%s%n",Name,m.getName());
			m.setLife(m.getLife()-40);
		}
		if (m.getLife()<=0) {
			System.out.printf("%s被%s打死了%n",m.getName(),Name);
			System.exit(0);
		}
	}
	
}
