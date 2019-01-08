package collectionsinjava;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {

	public static void main(String[] args) {

		Map<Integer, String> mp = new Hashtable<Integer, String>();
		mp.put(5, "dhruba");
		mp.put(4, "arif");
		mp.put(3, "mohan");
		//mp.put(null, null);
		//mp.put(2, null);
		//mp.put(7,null);
		//mp.put(null, "hari");
		System.out.println(mp);
		System.out.println(mp.size());
		System.out.println(mp.get(5));

	}

}
