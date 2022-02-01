package chapter16;

import java.util.ArrayList;
import java.util.List;

public class Practice16_1 {
	public static void main(String[] args) {
		List<Hero> Heros = new ArrayList<Hero>();
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		Heros.add(h1);
		Heros.add(h2);
		for (Hero h : Heros) {
			System.out.println(h.getName());
		}
	}
}
