
public class Main {

	public static void main(String[] args) {
		//Car[] carList = new Car(); //NO, abstract class cannot new Object
		Car[] carList1 = new SportsCar[2]; //OK, 2 sports cars
		//carList1[0]=new Truck(); //NO carList1 can only store sports car
		carList1[0]=new SportsCar();
		carList1[1]=new SportsCar();
		Car[] carList2 = new Car[3]; //OK, declare the size of array is 3
		carList2[0]=new Truck();
		carList2[1]=new SportsCar();
		carList2[2]=new Truck();
		
		for (int i = 0; i < carList1.length; i++) {
			carList1[i].move();
		}
		System.out.println("---------------------");
		for (int i = 0; i < carList2.length; i++) {
			carList2[i].move();			
		}
	}

}
