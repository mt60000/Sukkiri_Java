package practice;

public class Practice10 {
	public static void main(String[] args) {
		introduceOneself();
	}
	
	public static void introduceOneself() {
		String name = "mochi";
		int age = 99;
		float height = 201.5F;
		char zodiac = '寅';
		System.out.println("私の名前は" + name  + "。" +
			"年齢は" + age + "歳。" + "身長は" + height + "cm。" + "干支は" + zodiac + "だ。");
	}
}
