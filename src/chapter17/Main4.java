package chapter17;

public class Main4 {
	public static void main(String[] args) {
		try {
			// 試験的に例外を発生させる
			throw new UnsupportedMusicFileException
			("未対応のファイルです");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
