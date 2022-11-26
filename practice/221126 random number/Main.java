import java.util.Random;
import java.security.SecureRandom;

public class Main {
	public static void main(String[] args) {
		Random random1 = new Random();
		System.out.println("random int from 0~4");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d ",random1.nextInt(4));
		}
		System.out.println("\nrandom int from 1~3");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d ",random1.nextInt(1,3));
		}
		System.out.println("\nrandom double from 0.0~1.0");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%f ",random1.nextDouble());
		}
		System.out.println("\nrandom double from 1.5~3.0");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%f ",random1.nextDouble(1.5,3));
		}
		SecureRandom random2 = new SecureRandom();
		System.out.println("\n--------------\nrandom int");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d ",random2.nextInt());
		}
		System.out.println("\nrandom int from 5~10");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d ",random2.nextInt(5,10));
		}
		System.out.println("\nrandom double from 0.0~1.0");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%f ",random1.nextDouble());
		}
		System.out.println("\nrandom double from 1.5~3.0");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%f ",random1.nextDouble(1.5,3));
		}
	}
}
