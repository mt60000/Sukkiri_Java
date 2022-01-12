package practice;

public class Practice17_Computer extends Practice17_TangibleAsset {
	String makerName;
	
	//コンストラクタ
	public Practice17_Computer(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
	}
	
	//メソッド
	public String getMakerName() { return this.makerName; }
}
