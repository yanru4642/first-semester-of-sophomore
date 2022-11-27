
public class Fish extends Animal implements Eatable{
	public Fish() {
		this(0);
	}
	public Fish(int age) {
		super(age);
	}
	//虛擬函式一定要override(compiler會檢查)
	@Override
	public void speak() {
		System.out.println("fish speaking");
	}
	//不是abstract不一定要override
	//show() toString()
	
	//interface implementation
	@Override
	public void eat() {
		System.out.println("fish eat");
	}
}
