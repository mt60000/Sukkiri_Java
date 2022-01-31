package chapter15;

public class Main {
	public static void main(String[] args){
//		String s1 = "スッキリJava";
//		String s2 = "Java";
//		String s3 = "Java";
//		
//		if (s2.equals(s3)) {
//			System.out.println("s2とs3は等しい");
//		}
//		
//		if (s2.equalsIgnoreCase(s3)) {
//			System.out.println("s2ｓとs3はケースを区別しなければ等しい");
//		}
//		
//		System.out.println("s2とs3はケースを区別しなければ等しい");
//		
//		if ( s1.isEmpty()) {
//			System.out.println("s1は空文字です");
//		}
		
//		String s1 = "Java and JavaScript";
//		if (s1.contains("Java")) {
//			System.out.println("文字列s1は、Javaを含んでいます");
//		}
//		if (s1.endsWith("Java")) {
//			System.out.println("文字列s1は、Javaが末尾にあります");
//		}
//		System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
//		System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
		
//		String s1 = "Java programming";
//		System.out.println("文字列s1の4文字目以降は" + s1.substring(3));
//		System.out.println("文字列s1の4～8文字目は" + s1.substring(3, 8));
		
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < 10000; i++) {
//			sb.append("Java");
//		}
//		String s = sb.toString();
		
		
	
	//複雑なコード
//	public boolean isValidPlayerName(String name) {
//		if (name.length() != 8) {
//			return false;
//		}
//		char first = name.charAt(0);
//		if (!(first >= 'A' && first <= 'Z')) {
//			return false;
//		}
//		for (int i = 1; i < 8; i++) {
//			char c = name.charAt(i);
//			if (!((c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
//				return false;
//			}
//		}
//		return true;
//	}
	
//		String s = "abc,def:ghi";
//		String[] words = s.split("[,:]");
//		for (String w : words) {
//			System.out.print( w + "->");
//		}
		
//		String s = "abc,def:ghi";
//		String w = s.replaceAll("[beh]", "X");
//		System.out.println(w);
		
//		String s = String.format
//				(FORMAT, hero.getName(), hero.getJob(), hero.getGold());
//		System.out.println(s);
		
		System.out.printf("製造番号%s-%02d", "SJV", 3);
		
	}
	
	public boolean isValidPlayerName(String name) {
		return name.matches("[A-Z] [A-Z0-9]{7}");
	}
}
