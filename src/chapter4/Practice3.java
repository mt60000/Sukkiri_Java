package chapter4;

public class Practice3 {
	public static void main(String[] args) {
		int[] counts = null;
		float[] heights = {171.3F, 175.0F};
		System.out.println(counts[1]);
		System.out.println(heights[2]);
		// 7行目でNullPointerExceptionが発生
		// 8行目でArrayIndexOutOfBoundsExceptionが発生
	}
}
