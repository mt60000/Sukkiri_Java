
public class Cleric {
	String name;
	int hp = 50;
	final int maxHp = 50;
	int mp = 10;
	final int maxMp = 10;
	
	public void selfAid() {
		System.out.println("聖職者" + this.name + "はセルフエイドを唱えた！");
		this.hp = this.maxHp;
		this.mp -= 5;
		System.out.println("聖職者" + this.name + "は全回復した！");
	}
	
	public int pray(int sec) {
		System.out.println("聖職者" + this.name + "は" + sec + "秒間祈った！");
		
		int recover = new java.util.Random().nextInt(3) + sec;
		int recoverMp = Math.min(this.maxMp- this.mp, recover);
		
		this.mp += recoverMp;
		System.out.println("MPが" + recoverMp + "回復した！");
		return recoverMp;
	}
}
