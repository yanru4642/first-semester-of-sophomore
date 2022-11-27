
public class XDog extends Dog implements SuperAbilities{

	public XDog() {
		super();
	}
	public XDog(int age, String color) {
		super(age, color);
	}
	
	//必須實作所有interface裡面的方法
	public void fly() {
		System.out.printf("flying at %.1f speed\n",flySpeed);
	}
	public void stand() {
		System.out.printf("standing\n");
	}
	//可以override父類別的interface
	@Override
	public void eat() {
		System.out.println("Xdog eat");
	}

}
