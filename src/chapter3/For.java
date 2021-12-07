package chapter3;

public class For {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = i; j < 10; j++) {
				System.out.print(i * j); // 掛け算の結果を出力
				System.out.print(" "); // 空白を出力
			}
			System.out.println(""); // 改行を出力
		}
	}
}
