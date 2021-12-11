package chapter5;

public class MethodReturn {
	public static int add(int x, int y) {
		int ans = x + y;
		// 戻り値
		return ans;
		// returnでメソッドを終了し、これより下の処理は行わない
		// なにか処理を書いているとコンパイルエラーになる
	}
	public static void main(String[] args) {
		int ans = add(100, 10);
		System.out.println("100 + 10 = " + ans);
	} 
}
