package practice;

public class Practice14_Cleric {
	String name;
	final int maxHp = 50;
	int hp = maxHp;
	final int maxMp = 10;
	int mp = maxMp;
	
	public void selfAid() {
		System.out.println(name + "はセルフエイドを唱えた！");
		this.hp = maxHp;
		this.mp -= 5;
	}
	public int pray(int sec) {
//		int correction = new java.util.Random().nextInt(3);
//		int recovery = seconds + correction;
//		System.out.println(name + "は" + seconds + "秒間祈った！");
//		return recovery;
		
		int recover = new java.util.Random().nextInt(3) + sec;
		int recoverActual = Math.min(this.maxMp- this.mp, recover);
		System.out.println("MPが" + recoverActual + "回復した");
		return recoverActual;
	}
}
