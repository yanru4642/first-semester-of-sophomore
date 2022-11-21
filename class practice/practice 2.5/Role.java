abstract public class Role {
	private String Name;
	private int Life;
	private int Magic;
	//constructor
	public Role() {
		this("null", 0, 0);
	}
	public Role(String name, int life, int magic) {
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
	//toString
	@Override
	abstract public String toString();
}
