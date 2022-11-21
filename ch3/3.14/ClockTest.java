
public class ClockTest {

	public static void main(String[] args) {
		Clock clock1 = new Clock(22,57,39);
		System.out.printf("Initial: %s%n",clock1.displayTime());		
		clock1.sethour(25);
		System.out.printf("sethour(25): %s%n",clock1.displayTime());
		clock1.setminute(15);
		System.out.printf("setminute(15): %s%n",clock1.displayTime());
		clock1.setsecond(-9);
		System.out.printf("setsecond(-9): %s%n",clock1.displayTime());
	}

}
