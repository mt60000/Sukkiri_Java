package chapter2;

public class Scanner {
	public static void main(String[] args) {
		System.out.println("あなたの名前を入力してください。");
		// Scannerでキーボードで入力した文字を変数に代入
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください。");
		// 上と同じ
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ、" + age + "歳の" + name + "さん");
	}
}
