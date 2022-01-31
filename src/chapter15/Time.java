package chapter15;

import java.util.Calendar;
import java.util.Date;

public class Time {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		// ここで何らかの時間がかかる処理
		
		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は..." + (end - start) + "ミリ秒でした");
		
//		Date now = new Date();
//		System.out.println(now);
//		System.out.println(now.getTime());
//		Date past = new Date(1600705425827L);
//		System.out.println(past);
		
		Calendar c = Calendar.getInstance();
		// 6つのint値からDateインスタンスを生成
		c.set(2019,8,22,1,23,45);
		c.set(Calendar.MONTH, 9);
		Date d = c.getTime();
		System.out.println(d);
		// Dateインスタンスからint値を生成
		Date now = new Date();
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");
	}
}
