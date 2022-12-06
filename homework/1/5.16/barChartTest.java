import java.util.Scanner;
public class barChartTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] list = new int[5];
		System.out.println("Enter 5 numbers between 1 to 30");
		for (int i = 0; i < list.length; i++) {
			System.out.printf("Number %d > ",i+1);
			list[i]=input.nextInt();
			while (list[i]<1||list[i]>30) {
				System.out.print("Numbers should be between 1 to 30, enter again. ");
				list[i]=input.nextInt();
			}
		}
		for (int i = 0; i < list.length; i++) {
			System.out.printf("%nNumber %d: ",i+1);
			for (int j = 0; j < list[i]; j++) {
				System.out.printf("*");
			}
		}
		
		input.close();
	}
}