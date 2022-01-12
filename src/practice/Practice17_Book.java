package practice;

public class Practice17_Book extends Practice17_TangibleAsset {
	String isbn;
	
	//コンストラクタ
	public Practice17_Book(String name, int price, String color, String isbn) {
		super(name, price, color);
		this.isbn = isbn;
	}
	
	//メソッド
	public String getIsbn() { return this.isbn; }
}
