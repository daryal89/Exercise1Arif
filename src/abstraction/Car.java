package abstraction;

public class Car implements Vehicle{

	@Override
	public void engine() {
		System.out.println("car has engine");
		
	}

	@Override
	public void wheel() {
		System.out.println("car has 4 wheels");
		
	}

	@Override
	public void drive() {
		System.out.println("car has driving");
		
	}

	@Override
	public void stop() {
		System.out.println("car stopping");
		
	}

	@Override
	public void fuel() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		Vehicle c = new Car();
		c.drive();
		c.engine();
		c.wheel();
	}

}
