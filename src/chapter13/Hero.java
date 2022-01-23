package chapter13;

public class Hero {
	private int hp;
	private String name;
	
	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	
	private void die() {
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GAME OVERです。");
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("名前が短すぎる。処理を知中断。");
		}
		if (name.length() <= 1) {
			throw new IllegalArgumentException("名前が短すぎる。中断。");
		}
		if (name.length() >= 8) {
			throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
		}
		this.name = name;
	}
}