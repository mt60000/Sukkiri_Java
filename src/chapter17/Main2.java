package chapter17;

import java.io.FileWriter;

public class Main2 {
	public static void mainn(String[] args) {
		// 従来		
//		FileWriter fw = null;
//		try {
//			fw = new FileWriter("data.txt");
//			fw.write("hello!");
//		} catch (IOException e) {
//			System.out.println("何らかの例外が発生しました");
//		} finally {
//			if (fw != null) {
//				try {
//					fw.close();
//				} catch (IOException e) {
//					;
//				}
//			}
//		}
		
		// try-catch-resources文
		try (FileWriter fw = new FileWriter("data.txt");) {
			fw.write("hello!");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました");
		}
	}
}
