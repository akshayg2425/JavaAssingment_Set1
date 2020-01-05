package AssingmentSet2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Assingment16 {

	public static void main(String[] args) {

		int c = 0;
		int b = 0;
		int count = 0;

		Map<Integer, Integer> hmap = new HashMap<>();

		hmap.put(12, 90);
		hmap.put(35, 90);
		hmap.put(33, 90);
		hmap.put(56, 88);

		System.out.println(hmap);

		Iterator<Integer> itrator = hmap.keySet().iterator();

		System.out.println(hmap.values());

		while (itrator.hasNext()) {
			b = itrator.next();

			if (b % 2 != 0) {
				c++;

				System.out.println(hmap.keySet());
				System.out.println(hmap.get(b));

				count = count + hmap.get(b);
			}

		}

		System.out.println(count / c);

	}

}
