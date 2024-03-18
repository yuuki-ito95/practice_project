package method.q08;

public class SumLoop {

	public static void main(String[] args) {
		int[] answer = sumLoop();
		int minValue = answer[0];
		int maxValue = answer[1];
		int sumValue = answer[2];
		System.out.println("最小値：" + minValue);
		System.out.println("最大値：" + maxValue);
		System.out.println("加算結果：" + sumValue);
	}

	public static int[] sumLoop() {
		int sumValue = 0;
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		for (int i = 1; i <= 100; i++) {
			sumValue += i;
			if (i < minValue) {
				minValue = i;
			}
			if (i > maxValue) {
				maxValue = i;
			}
		}
		int[] answer = { minValue, maxValue, sumValue };
		return answer;
	}

}
