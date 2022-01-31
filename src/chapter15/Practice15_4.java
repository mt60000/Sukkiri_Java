package chapter15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practice15_4 {
	public static void main(String[] args) {
	// Time API
		LocalDate now = LocalDate.now();
		LocalDate day = now.plusDays(100);
		DateTimeFormatter fmt =
			DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println(day.format(fmt));
	}
}
