package practice;

public class Practice16_Matango {
	int hp = 50;
	char suffix;
	
	public Practice16_Matango(char suffix) {
		this.suffix = suffix;
	}
	public void attack(Practice16_Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
	}
}
