package chapter4;

public class Array100 {
	public static void main(String[] args) {
		int[] arrayA = {1, 2, 3};
		int[] arrayB;
		arrayB = arrayA;
		// arrayAの番地をそのまま取ってくるので、arrayBに代入してもarrayAが変更される
		arrayB[0] = 100;
		System.out.println(arrayA[0]);
	}
}
