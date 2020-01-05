package AssingmentSet2;

import java.util.ArrayList;
import java.util.List;

public class Assingment13 {

	public static void main(String[] args) {

		int input1 = 10;

		int input2 = 120;

		int sum = 0;

		List<Integer> l = new ArrayList<Integer>();

		for (int i = input1; i <= input2; i++) {
			int n1 = i;
			int rem = 0;
			while (n1 != 0) {
				rem = (rem * 10) + (n1 % 10);
				n1 = n1 / 10;
			}

			if (rem == i) {
				l.add(i);
				System.out.println(l);
			}

		}
		for (int i = 0; i < l.size(); i++) {

			sum = sum + l.get(i);

		}

		System.out.println(sum);
	}

}
