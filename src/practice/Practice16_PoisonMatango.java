package practice;

public class Practice16_PoisonMatango extends Practice16_Matango {
	int mp = 5;
	public Practice16_PoisonMatango(char suffix) {
		super(suffix);
	}
	public void attack(Practice16_Hero h) {
		super.attack(h);
		if (this.mp != 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int damage = h.hp / 5;
			h.hp -= damage;
			System.out.println(damage + "ポイントのダメージ！");
			this.mp--;
		}
	}
}
