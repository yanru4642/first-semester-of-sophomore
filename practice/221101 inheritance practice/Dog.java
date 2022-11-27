
public class Dog extends Animal implements Eatable{
	private String color;
	public Dog() {
		this(0, "null");
	}
	public Dog(int age, String color) {
		super(age);
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	 public void speak() {
		 System.out.println("dog speaking");
	 }
	 @Override
	public void show() {
		System.out.printf("it's a dog\n");
	}
	@Override
	public String toString() {
		return String.format("%s color:%s", super.toString(),color);
	}
	public void eat() {
		System.out.println("dog eat");
	}
}
