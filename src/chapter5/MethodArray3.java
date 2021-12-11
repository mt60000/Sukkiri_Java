package chapter5;

public class MethodArray3 {
	// int型配列を作成して戻すメソッド
	public static int[] makeArray(int size) {
		int[] newArray = new int[size];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = i;
		}
		// 配列を返す
		return newArray;
	}
	public static void main(String[] args) {
		int[] array = makeArray(3);
		// arrayの要素を全て出力
		for (int i : array) {
			System.out.println(i);
		}
	}
}
