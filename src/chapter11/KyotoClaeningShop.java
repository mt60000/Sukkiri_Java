package chapter11;

public class KyotoClaeningShop implements CleaningServise {
	String ownerName;
	String address;
	String phone;
	//シャツをあらう
	public Shirt washShirt(Shirt s) {
		//大型洗濯機15分
		return s;
	}
	//タオルを洗う
	public Towl washTowl(Towl t) {
		//大型洗濯機10分
		return t;
	}
	//コートをあらう
	public Coat washCoat(Coat c) {
		// ドライ20分
		return c;
	}
}
