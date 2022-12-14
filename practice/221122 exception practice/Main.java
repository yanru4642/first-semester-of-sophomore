import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continueLoop = true;
		int a,b,c;
		do {
			try {
				System.out.print("a> ");
				a = sc.nextInt();
				System.out.print("b> ");
				b = sc.nextInt();
				c = divide(a, b);
				System.out.println("a/b="+c);
				continueLoop = false;
			} catch (InputMismatchException inputMismatchException) {
				System.err.println("Input should be a number. Enter again.");
				sc.nextLine();
			} catch (IllegalArgumentException illegalArgumentException) {
				System.err.printf("%s",illegalArgumentException.getMessage());
			}catch (ArithmeticException arithmeticException) {
				System.err.println("Cannot divide by zero. Enter again");
			} finally {
				System.out.println("finally executed");
			}
		} while (continueLoop);
		
		sc.close();
	}

	public static int divide(int a, int b) throws ArithmeticException, IllegalArgumentException{
		if (a<0) {
			throw new IllegalArgumentException("a should >0\n");
		}
			return a / b;
	}
}
