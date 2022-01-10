package practice;

public class Practice5 {
	public static void main(String[] args) {
		// weight == 60;
		//(age1 + age2) * 2 > 60;
		// (age % 2) == 1;
		// name.equals("湊");  ←文字の一致に関する条件式
		int isHungry = 1;
		String food = "mochi";
		System.out.println("こんにちは");
		if(isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("はらぺこです");
			System.out.println(food + "をいただきます");
			System.out.println("ごちそうさまでした");
		}
	}
}
