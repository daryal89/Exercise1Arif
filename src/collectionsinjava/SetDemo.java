package collectionsinjava;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

Set <Integer>set = new HashSet<Integer>();
set.add(1);
set.add(2);
set.add(3);
set.add(4);
set.add(2);
set.add(3);
set.add(5);
System.out.println(set.size());
System.out.println(set.isEmpty());
set.add(null);
System.out.println(set);
	}

}
