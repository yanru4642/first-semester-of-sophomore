import java.util.Scanner;
public class studentGradesTest {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String[] studentNameList= new String[5];
		char[] studentGradeList=new char[5];
		int[] numberOfGrade=new int[5];
		
		for (int i = 0; i < studentNameList.length; i++) {
			System.out.printf("Enter sutdent%d's name and grade> ",i+1);
			studentNameList[i]=input.next();
			studentGradeList[i]=input.next().charAt(0);
			switch (studentGradeList[i]) {
			case 'A':
			case 'a':
				numberOfGrade[0]+=1;
				break;
			case 'B':
			case 'b':
				numberOfGrade[1]+=1;
				break;
			case 'C':
			case 'c':
				numberOfGrade[2]+=1;
				break;
			case 'D':
			case 'd':
				numberOfGrade[3]+=1;
				break;
			default:
				numberOfGrade[4]+=1;
			}
		}
		
		for (int i = 0; i < studentGradeList.length; i++) {
			System.out.printf("%s's grade:%c    ", studentNameList[i],studentGradeList[i]);
		}
		System.out.println();
		for (int i = 0; i < numberOfGrade.length; i++) {
			if (i==numberOfGrade.length-1) {
				System.out.printf("Other: %d student(s)",numberOfGrade[i]);
			}else {
				System.out.printf("Grade %c: %d student(s)%n",i+'A',numberOfGrade[i]);
			}
		}
		
		input.close();
	}
}