package method.q09;

public class Even {

	public static void main(String[] args) {
		int num = 5;
		boolean answer = checkEven(num);
		System.out.println(num + "は" + (answer ? "偶数です。" : "奇数です。"));
	}

	public static boolean checkEven(int num) {
		return num % 2 == 0;
	}

}
