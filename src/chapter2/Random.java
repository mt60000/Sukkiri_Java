package chapter2;

public class Random {
	public static void main(String[] args) {
		// RandomでnextInt()内の数値以下からランダムに代入する
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたはたぶん、 " + r + "歳ですね？");
	}
}
