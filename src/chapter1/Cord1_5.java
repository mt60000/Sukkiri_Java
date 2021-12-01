package chapter1;

public class Cord1_5 {
	public static void main(String[] args) {
		// final付きで宣言された変数は定数となり、
		// 宣言時に代入された値から変更することができなくなる
		final double PI = 3.14;
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
		
		// System.out.println("パイの半径を倍にします");
		// final の変数を変更しようとすると、コンパイルエラーになる
		// PI = 10;
		// System.out.println("半径" + pie + "cmのパイの面積は、");
		// System.out.println(pie * pie * PI );
	}
}
