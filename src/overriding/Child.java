package overriding;

public class Child extends Parent{
	
	public void add( int a, int b) {
		System.out.println("This is child class");
		int sum = a+b;
		System.out.println(sum);
	}

	public  void addString(String a, String b) {
		System.out.println("This is child class");
		String x =  a + b;
		System.out.println(x);
	}
	
	public void start() {
		System.out.println("car is starting  child class");
	}

	
	public static void main(String[] args) {
		Child cd = new Child();
		cd.add(10,20); //parent class method is overridden
		cd.addString("arif","Dhruba"); // parent class method is overridden
		cd.start();//child class method
		cd.stop(); //parent class
		
		// parent class object
		Parent pt = new Child();
		pt.add(20, 30);
		pt.addString("Hello", "Ram");
		pt.stop();
		//pt.start();
		
	}
}
