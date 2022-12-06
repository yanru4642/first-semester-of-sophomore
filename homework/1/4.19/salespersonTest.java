import java.util.Scanner;

public class salespersonTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double[] itemValueList={239.99,129.75,99.95,350.89};
		int[] numberOfItem=new int[4]; //the number of each item
		double week=0; //the number of week
		double totalPay=0; //total pay for the salesperson
		
		//prompt user input
		System.out.print("Wage 200 per week, enter the number of week> ");
		week=input.nextInt();
		while(week<0) {
			System.out.print("Number should be positive, enter again. ");
			week=input.nextInt();
		}
		for(int i=0;i<itemValueList.length;i++) {
			System.out.printf("How many item%d does the salesperson sale? ",i+1);
			numberOfItem[i]=input.nextInt();
			while(numberOfItem[i]<0) {
				System.out.print("Number should be positive, enter again. ");
				numberOfItem[i]=input.nextInt();
			}
		}
		
		//calculate total pay
		totalPay=week*200.0;
		for (int i = 0; i < itemValueList.length; i++) {
			totalPay+=itemValueList[i]*numberOfItem[i]*0.09;
		}
		System.out.printf("Total pay for the salesperson: %.2f",totalPay);
		
		input.close();
	}
}
