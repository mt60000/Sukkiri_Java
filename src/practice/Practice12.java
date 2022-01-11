package practice;

public class Practice12 {
	public static void main(String[] args) {
		double x = 10.0;
		double y = 5.0;
		double z = 5.0;
		
		System.out.println("三角形の底辺の長さが" + x + "cm、高さが" + y + "cmの場合、面積は" + calcTriangleArea(x, y) + "㎠");
		
		System.out.println("円の半径が" + z + "cmの場合、面積は" + calcCircleArea(z) + "㎠");
	}
	
	public static double calcTriangleArea(double bottom, double height) {
		double area = bottom * height / 2;
		return area;
	}
	
	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}
}
