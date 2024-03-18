package method.q05;

public class Triangle {

	public static void main(String[] args) {
		int under = 8;
		int height = 5;
		int triangleArea = getTriangleArea(under, height);
		System.out.println("底辺：" + under);
		System.out.println("高さ：" + height);
		System.out.println("三角形の面積：" + triangleArea);
	}

	public static int getTriangleArea(int num1, int num2) {
		return (num1 * num2) / 2;
	}

}
