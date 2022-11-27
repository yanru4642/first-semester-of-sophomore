
 abstract public class Animal {
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Animal() {
		this(0);
	}
	public Animal(int age) {
		this.age = age;
	}
	abstract public void speak();
	public void show() {
		System.out.println("it's an animal");
	}
	@Override
	public String toString() {
		return String.format("%s age:%d",getClass(),age);
	}
}
