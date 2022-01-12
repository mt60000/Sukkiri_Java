package practice;

public class Practice15_Thief {
	String name;
	int hp;
	int mp;
	
	public Practice15_Thief(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	public Practice15_Thief(String name, int hp) {
		this(name, hp, 5);
	}
	
	public Practice15_Thief(String name) {
		this(name, 40);
	}
}
