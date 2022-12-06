
public class CarApplication {

	public static void main(String[] args) {
		Car car1 = new Car("toyota","2005",1010.99);
		Car car2 = new Car("benz","2013",2779.49);
		//show car information
		car1.showInfo();
		car2.showInfo();
		//discount the price
		car1.setPrice(car1.getPrice()*0.95);
		car2.setPrice(car2.getPrice()*0.93);
		//show the price
		System.out.printf("car1 price after discount: %f%n",car1.getPrice());
		System.out.printf("car2 price after discount: %f%n",car2.getPrice());
	}

}
