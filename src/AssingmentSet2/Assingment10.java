package AssingmentSet2;

import java.util.ArrayList;
import java.util.List;

public class Assingment10 {

	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();

		l.add("arun#12#12#12");
		l.add("deepak#13#12#12");

		int n1 = 0;
		int n2 = 0;

		String name = "";

		String name1 = "";

		String[] a = l.get(0).split("#");

		String[] b = l.get(1).split("#");

		for (int i = 0; i < a.length - 1; i++) {

			n1 = n1 + Integer.parseInt(a[i + 1]);

			name = a[0];
		}

		for (int i = 0; i < b.length - 1; i++) {
			n2 = n2 + Integer.parseInt(b[i + 1]);

			name1 = b[0];
		}

		if (n1 > n2) {
			System.out.println(name);
		}

		else {
			System.out.println(name1);
		}
	}

}
