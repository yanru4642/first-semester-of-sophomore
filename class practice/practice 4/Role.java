abstract public class Role implements LifeRecoverable, MagicRecoverable {
	private String Name;
	private double Life;
	private double Magic;

	// constructor
	public Role() {
		this("null", 0, 0);
	}

	public Role(String name, double life, double magic) {
		this.Name = name;
		this.Life = life;
		this.Magic = magic;
	}

	// set and get functions
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getLife() {
		return Life;
	}

	public void setLife(double life) {
		Life = life;
	}

	public double getMagic() {
		return Magic;
	}

	public void setMagic(double magic) {
		Magic = magic;
	}

	// drug
	public void DrinkDrug(Drug d) {
		if (d instanceof RedDrug) {
			Life += ((RedDrug) d).getAddLife();
		} else {
			Magic += ((BlueDrug) d).getAddMagic();
		}
	}

	// interface implementation
	public abstract double recoverMagic();
	public abstract double recoverLife();
}
