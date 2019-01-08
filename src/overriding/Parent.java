package overriding;

public class Parent {
	
	public void add( int a, int b) {
		System.out.println("This is parent class");
		int sum = a+b;
		System.out.println(sum);
	}

	public  void addString(String a, String b) {
		System.out.println("This is parent class");
		String x =  a + b;
		System.out.println(x);
	}
	
	public void stop() {
		System.out.println("car is stopping parent class");
	}
}
