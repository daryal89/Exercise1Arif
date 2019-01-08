package collectionsinjava;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(5, "dhruba");
		mp.put(4, "arif");
		mp.put(3, "mohan");
		mp.put(null, null);
		mp.put(2, null);
		mp.put(7,null);
		mp.put(null, "hari");
		System.out.println(mp);
		System.out.println(mp.size());
		System.out.println(mp.get(5));

	}

}
