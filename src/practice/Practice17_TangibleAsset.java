package practice;

public abstract class Practice17_TangibleAsset extends Practice17_Asset
		implements Practice17_Thing {
	String color;
	double weight;
	
	public Practice17_TangibleAsset
			(String name, int price, String color) {
		super(name, price);
		this.color = color; 
	}
	
	public String getColor() { return this.color; }
	public double getWeight() { return this.weight; }
	public void setWeight(double weight) { this.weight = weight; }
}
