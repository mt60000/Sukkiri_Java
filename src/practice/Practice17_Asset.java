package practice;

public abstract class Practice17_Asset {
	String name;
	int price;
	
	public Practice17_Asset(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() { return this.name; }
	public int getPrice() { return this.price; }
}
