public class Main {
	public static void main(String[] args) {
		//沒有設為static需要有Main物件才能呼叫function
		Main mainObj = new Main();
		System.out.printf("a+b=%d\n", mainObj.add(3,4));
		//設為static不須物件就能呼叫function
		sayHello();
		//設為static也可以用Main物件呼叫
		mainObj.sayHello();
	}
	public int add(int a, int b) {
		return a+b;
	}
	public static void sayHello() {
		System.out.println("Hello");
	}
}