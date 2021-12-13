package chapter5;

public class Practice3 {
	public static double calcTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}
	
	public static double calcCircleArea(double radius) {
		return radius * radius * 3.14;
	}
	
	public static void main(String[] args) {
		double bottom = 10.0;
		double height = 5.0;
		double radius = 5.0;
		System.out.println("三角形の底辺の長さが" + bottom + "cm、高さが" + height + "cmの場合、面積は" + calcTriangleArea(bottom, height) + "cm²");
		System.out.println("円の半径が" + radius + "の場合、面積は" + calcCircleArea(radius) + "cm²");
	}
}
