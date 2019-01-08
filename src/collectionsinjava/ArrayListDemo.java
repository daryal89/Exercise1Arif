package collectionsinjava;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);//index =0
		a.add(5);//index =1
		a.add(10);
		a.add(15);
		a.add(0,10);
		System.out.println(a.size());
		System.out.println(a.get(0));
		System.out.println(a.remove(0));
		
		System.out.println(a);

	}

}
