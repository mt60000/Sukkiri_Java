package chapter13;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int)(basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		if (hp <= 0) {
			this.hp = 0;
		}
		this.hp = hp;
	}
	
	public int getMp() {
		return this.mp;
	}
	
	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException("MPは0以上を設定してください");
		}
		this.mp = mp;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("名前は3文字以上を設定してください");
		}
		this.name = name;
	}
	
	public Wand getWand() {
		return this.wand;
	}
	
	public void setWand(Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException("杖がｎullになっています");
		}
		this.wand = wand;
	}
}
