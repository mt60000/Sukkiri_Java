package chapter5;

public class practice {
	public static void introduceOneself(String name, int age, float height, char zodiac) {
		System.out.println("はじめまして、" + name + " です");
		System.out.println("年齢は " + age + "歳、" + "身長は " + height + "cm、" + zodiac + "年です。");
		System.out.println("よろしくお願いします");
	}
	public static void main(String[] args) {
		introduceOneself("もち", 999, 202.5F, '寅');
	}
}
