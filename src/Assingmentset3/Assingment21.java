package Assingmentset3;
//Find the extension of a given string file.

import java.util.StringTokenizer;

public class Assingment21 {

	public static void main(String[] args) {

		String input = "abc.ing";

		StringTokenizer st = new StringTokenizer(input, ".");

		String one = st.nextToken();

		System.out.println(one);

		String two = st.nextToken();

		System.out.println("Result string is " + two);

	}

}
