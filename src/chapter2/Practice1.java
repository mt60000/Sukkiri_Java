package chapter2;

public class Practice1 {
	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		
		// int型とString型を混ぜて使っているため、このコードの場合int型がString型になってしまう。
//		String ans = "x+yは" + x + y;
//		System.out.println(ans);
		
		// 自分の回答
		int ans = x + y;
		System.out.println("x+yは" + ans);
		
		// 回答
		// String = "x+yは" + (x + y);
		// （）をつけて評価順位を上げる
	}
}
