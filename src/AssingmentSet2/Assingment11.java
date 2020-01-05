package AssingmentSet2;

//Two inputs of a string array and a string is received. The array shld be sorted in descending order. The index of second input in a array shld be retrieved

import java.util.ArrayList;
import java.util.Collections;

public class Assingment11 {

	public static void main(String[] args) {

		System.out.println("O/p is " + Outputresult());
	}

	public static int Outputresult() {
		String[] array = { "good", "yb", "awe" };

		String s = "awe";

		ArrayList<String> arli = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {

			arli.add(array[i]);

		}

		Collections.sort(arli, Collections.reverseOrder());

		System.out.println(arli);

		int n = arli.indexOf(s);
		return n;

	}

}
