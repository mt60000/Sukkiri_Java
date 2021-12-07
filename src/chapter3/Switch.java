package chapter3;

public class Switch {
	public static void main(String[] args) {
//		System.out.println("あなたの運勢を占います");
//		// 1...3の乱数
//		int fortune = new java.util.Random().nextInt(3) + 1;
//		switch (fortune) {
//		case 1:
//			System.out.println("大吉");
//			// breakで明示的に処理を中断している。忘れた場合、処理が継続されてしまう。
//			break;
//		case 2:
//			System.out.println("中吉");
//			break;
//		case 3:
//			System.out.println("吉");
//			break;
//		default:
//			System.out.println("凶");
//		}
		
		System.out.println("あなたの運勢を占います");
		// 1...5の乱数
		int fortune = new java.util.Random().nextInt(5) + 1;
		switch (fortune) {
		// あえてbreakを記述しないコード
		case 1:
		case 2:
			System.out.println("いいね！");
			break;
		case 3:
			System.out.println("普通です");
			break;
		case 4:
		case 5:
			System.out.println("うーん・・・");
		}
	}
}
