public class Warrior extends Role {
	// contructor
	public Warrior() {
		super();
	}

	public Warrior(String name, int life, int magic) {
		super(name, life, magic);
	}

	// attack
	public void NewMoon(Role r) {
		if (r instanceof Warrior) {
			if (this.getMagic() < 10) {
				System.out.printf("%s attacks %s魔力不足%n", this.getName(), r.getName());
			} else {
				this.setMagic(this.getMagic() - 10);
				System.out.printf("%s攻擊%s%n", this.getName(), r.getName());
				r.setLife(r.getLife() - 25);
			}
		} else {
			if (this.getMagic() < 10) {
				System.out.printf("%s attacks %s魔力不足%n", this.getName(), r.getName());
			} else {
				this.setMagic(this.getMagic() - 10);
				System.out.printf("%s攻擊%s%n", this.getName(), r.getName());
				r.setLife(r.getLife() - 40);
			}
		}
	}

	// toString
	@Override
	public String toString() {
		return ("戰士名:" + getName() + "  Life:" + getLife() + "  Magic:" + getMagic());
	}
	
}
