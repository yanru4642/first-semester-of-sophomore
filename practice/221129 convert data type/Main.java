
public class Main {
	
	public static void main(String[] args) {
		int intNum = 0;
		double doubleNum = 0;
		try {
			intNum=Integer.parseInt("2005");
			System.out.printf("str to int: %d\n", intNum);
		} catch (NumberFormatException numberFormatExceptionr) {
			System.err.println("string not an int number");
		}
		try {
			doubleNum=Double.valueOf("-053.944");
			System.out.printf("str to double: %.2f\n", doubleNum);
		} catch (NumberFormatException numberFormatExceptionr) {
			System.err.println("string not a double number");
		}
		String intString=Integer.toString(intNum);
		String doubleString=String.valueOf(doubleNum);
		System.out.printf("int to str: %s\n", intString);
		System.out.printf("double to str: %s\n", doubleString);
		
		
	}

}
