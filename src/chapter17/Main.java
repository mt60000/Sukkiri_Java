package chapter17;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		// 例外が発生した際の代替処理がないとコンパイルエラーになる
		// try-catchで代替処理を角とコンパイルエラーがなくなる
		try {
			FileWriter fw = new FileWriter("data.txt");
		} catch (IOException e) {
			System.out.println("エラーが発生しました");
		}
	}
}
