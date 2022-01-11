package practice;

public class Practice8 {
	public static void main(String[] args) {
//		int[] points = new int[4]; 
//		double[] weights = new double[5];
//		boolean[] answers = new boolean[3];
//		String[] names = new String[3];
		
	/*	int[] moneyList = new int[3];
		moneyList[0] = 121902;
		moneyList[1] = 8302;
		moneyList[2] = 55100;
		↑スマートじゃない
	*/
		int[] moneyList = {121902, 8302, 55100};
		for (int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		for (int m : moneyList) {
			System.out.println(m);
		}
	}
}
