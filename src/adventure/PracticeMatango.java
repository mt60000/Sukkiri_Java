package adventure;

public class PracticeMatango {
	int hp = 50;
	char suffix;
	public PracticeMatango(char suffix) {
		this.suffix = suffix;
	}
	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
	}
}
