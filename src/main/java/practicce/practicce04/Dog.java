package practicce.practicce04;

public class Dog extends Animal {

	private String furColor;

	public Dog(String name, int age, String furColor) {
		super(name, age);
		this.furColor = furColor;
	}

	public String getFurColor() {
		return this.furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("毛の色：" + this.getFurColor());
	}

	public void cry() {
		System.out.println("鳴き声：ワン");
	}

}
