package chapter15;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Time3 {
	public static void main(String[] args) {
		// LocalDateTimeの生成方法
		LocalDateTime l1 = LocalDateTime.now();
		LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0);
		
		// LocalDateTimeとZonedDateTimeの相互変換
		ZonedDateTime z1 = l1.atZone(ZoneId.of("Europe/London"));
		LocalDateTime l3 = z1.toLocalDateTime();
	}
}
