package adventure;

public class PoisonMatango extends PracticeMatango {
	int mp = 5;
	public void attack(Hero h) {
		super.attack(h);
		if(this.mp > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int dmg = h.hp / 5;
			h.hp -= dmg;
			System.out.println(dmg + "ポイントのダメージ！");
			this.mp--;
		}
	}
	public PoisonMatango(char suffix) {
		super(suffix);
	}
}
