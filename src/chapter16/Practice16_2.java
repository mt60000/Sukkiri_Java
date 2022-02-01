package chapter16;

import java.util.HashMap;
import java.util.Map;

public class Practice16_2 {
	public static void main(String[] args) {
		Map<Hero, Integer> heros = new HashMap<Hero, Integer>();
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		heros.put(h1, 3);
		heros.put(h2, 7);
		for (Hero h : heros.keySet()) {
			int value = heros.get(h);
			System.out.println(h.getName() + "が倒した敵＝" + value);
		}
	}
}
