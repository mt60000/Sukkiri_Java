package chapter15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Practice15_3 {
	
	// Date　API
	public static void main(String[] args) throws Exception {
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int day = c.get(Calendar.DAY_OF_MONTH);
		c.set(Calendar.DAY_OF_MONTH, day);
		Date d = c.getTime();
		SimpleDateFormat f = new SimpleDateFormat
			("yyyy/MM/dd HH:mm:ss");
		String s = f.format(d);
		System.out.println(s);
	}
}
