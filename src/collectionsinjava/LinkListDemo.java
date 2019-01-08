package collectionsinjava;

import java.util.LinkedList;

public class LinkListDemo {
	public static void main(String[] args) {
		
		LinkedList <String> l = new LinkedList<String>();
		l.add("ram");
		l.add("arif");
		l.add("dhruba");
		l.add("shyam");
		
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.get(0));
		
	}

}
