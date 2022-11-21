public class Mage extends Role {
	// constructor
	public Mage() {
		super();
	}

	public Mage(String name, int life, int magic) {
		super(name, life, magic);
	}

	// attack
	public void SmallFire(Role r) {
		if (r instanceof Warrior) {
			if (this.getMagic() < 25) {
				System.out.printf("%s attacks %s 魔力不足%n", this.getName(), r.getName());
			} else {
				this.setMagic(this.getMagic() - 25);
				System.out.printf("%s攻擊%s%n", this.getName(), r.getName());
				r.setLife(r.getLife() - 40);
			}
		} else {
			if (this.getMagic() < 25) {
				System.out.printf("%s attacks %s 魔力不足%n", this.getName(), r.getName());
			} else {
				this.setMagic(this.getMagic() - 25);
				System.out.printf("%s攻擊%s%n", this.getName(), r.getName());
				r.setLife(r.getLife() - 60);
			}
		}
	}

	// toString
	@Override
	public String toString() {
		return ("法師名:" + getName() + "  Life:" + getLife() + "  Magic:" + getMagic());
	}
	/*
	// drink drug
	@Override
	public void DrinkDrug(Drug d) {
		if (d instanceof RedDrug) {
			this.setLife(this.getLife() + ((RedDrug) d).getAddLife());
		} else {
			this.setMagic(this.getMagic() + ((BlueDrug) d).getAddMagic());
		}
	}
	*/

}
