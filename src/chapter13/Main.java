package chapter13;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.setName("Hero");
		Wizard w = new Wizard();
		w.setName("mochi");
		System.out.println("ウィザードの名前： " + w.getName());
	}
}
