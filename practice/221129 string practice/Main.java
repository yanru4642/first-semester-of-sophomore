
public class Main {

	public static void main(String[] args) {
		String name1="bbc";
		String name2="bb";
		String name3="bbe";
		String name4="Bbc";
		//String compare
		System.out.println(name1.compareTo(name2)); //1
		System.out.println(name1.compareTo(name3)); //-2
		System.out.println(name2.compareTo(name3)); //-1
		System.out.println(name1.compareTo(name1)); //0
		System.out.println(name1.compareTo(name4)); //32
		System.out.println(name1.compareToIgnoreCase(name4)); //0
		//String equal
		System.out.println(name1.equals(name4)); //false
		System.out.println(name1.equalsIgnoreCase(name4)); //true
		//String split
		String name5="2005/05/03";
		String[] splits=name5.split("/");
		for (String split : splits) {
			System.out.printf("%s ", split);
		}
		
		
	}

}
