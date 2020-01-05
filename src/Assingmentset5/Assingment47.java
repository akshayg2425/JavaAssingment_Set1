package Assingmentset5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Assingment47 {

	public static void main(String[] args) {

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

		hm.put(1, 20);
		hm.put(4, 54);
		hm.put(12, 0);
		hm.put(15, 45);
		hm.put(45, 14);

		Iterator<Integer> it = hm.keySet().iterator();

		int c = 0;

		while (it.hasNext()) {
			
			int t = it.next();
			System.out.println(t);
			if (t % 4 == 0) {
				c++;
				//System.out.println(c);
			}

		}

		System.out.println(" Count of Keys Which are not divisible by 4 is -----> " + c);
	}

}
