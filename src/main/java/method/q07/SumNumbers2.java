package method.q07;

public class SumNumbers2 {

	public static void main(String[] args) {
		int integer = 5;
		double num = 3.3;
		int answer = (int)calculateSum(integer, num);
		System.out.println("第一引数(整数)：" + integer);
		System.out.println("第二引数(実数)：" + num);
		System.out.println("加算結果：" + answer);
	}
	
	public static double calculateSum(int integer, double num) {
		return integer + num;
	}

}
