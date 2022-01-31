package chapter15;

public class Practice15_1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 10000; i++) {
			sb.append(i);
		}
		String s = sb.toString();
	}
}
