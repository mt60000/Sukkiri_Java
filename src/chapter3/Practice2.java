package chapter3;

public class Practice2 {
	public static void main(String[] args) {
		int isHangry = 1;
		String food = "Chocolate";
		
		System.out.println("こんにちは");
		if (isHangry == 0) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("はらぺこです");
			
			System.out.println(food + "をいただきます");
			System.out.println("ごちそうさまでした");
		}
	}
}
