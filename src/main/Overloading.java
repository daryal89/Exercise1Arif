package main;

public class Overloading {

	public void add(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	public void add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println(sum);
	}

	public void add(double a, double b, double c) {
		double sum = a + b + c;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Overloading obj = new Overloading();
		obj.add(12,12);
		obj.add(10, 12,31);
		obj.add(10.0, 11.0, 12.0);

	}

}
