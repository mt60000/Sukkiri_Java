package chapter13;

public class Wand {
	private String name;
	private double power;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("名前は3文字以上を設定してください");
		}
		this.name = name;
	}
	
	public double getPower() {
		return power;
	}
	
	public void setPower(double power) {
		if (power < 0.5 || power > 100) {
			throw new IllegalArgumentException("杖の増幅率は0.5～100までの間で設定してください");
		}
		this.power = power;
	}
}
