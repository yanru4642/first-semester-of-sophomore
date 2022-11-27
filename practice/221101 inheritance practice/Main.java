
public class Main {
	public static void main(String[] args) {
		/*
		//Animal變成abstract後，不可建立Animal物件(虛擬類別)
		Animal animal1 = new Animal();
		animal1.speak();
		animal1.show();
		*/
		//多型: 將子類別物件指派到以父類別宣告的指標
		Animal fish_animal = new Fish();
		fish_animal.speak();
		fish_animal.show();
		((Fish)fish_animal).eat();
		System.out.println(fish_animal);
		System.out.println("--------------------");
		
		Animal dog_animal = new Dog(10, "white");
		dog_animal.speak();
		dog_animal.show();
		//向下轉型
		if(dog_animal instanceof Dog) {
			System.out.println( ((Dog)dog_animal).getColor() );
		}
		System.out.println(dog_animal);
		((Dog)dog_animal).eat();	
		System.out.println("--------------------");
		
		//多個interface繼承
		Animal xdog_animal = new XDog();
		System.out.println(xdog_animal);
		((XDog)xdog_animal).eat();		
		((XDog)xdog_animal).fly();
		((XDog)xdog_animal).stand();
		System.out.println("--------------------");
		
		//interface當指標
		Flyable flyDog = new XDog(999,"X");
		System.out.println(flyDog);
		//要轉型才能speak
		((XDog)flyDog).speak();
		flyDog.fly();
		//要轉型才能stand
		((XDog)flyDog).stand();
		
		
	}
}
