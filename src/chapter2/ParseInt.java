package chapter2;

public class ParseInt {
	public static void main(String[] args) {
		String age = "31";
		// parseIntで文字列をint型に変更
		int n = Integer.parseInt(age);
		System.out.println("あなたは来年、 " + (n + 1) + "歳になりますね。 ");
	}
}
