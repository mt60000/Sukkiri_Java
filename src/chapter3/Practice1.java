package chapter3;

public class Practice1 {
	public static void main(String[] args) {
		int weight = 60;
		int age1 = 20;
		int age2 = 10;
		int age = 5;
		String name = "湊";
		if (weight == 60) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if ((age1 + age2) * 2 > 60) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if (age % 2 == 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if (name.equals("湊")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
