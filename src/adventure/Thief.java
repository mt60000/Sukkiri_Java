package adventure;

public class Thief extends Character {
	int mp;
	public Thief(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	public Thief(String name, int hp) {
		this(name, hp, 5);
	}
	public Thief(String name) {
		this(name, 40);
	}
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に5ポイントのダメージ");
//		m.hp -= 5;
	}
	
	public Thief() {
		
	}
}


