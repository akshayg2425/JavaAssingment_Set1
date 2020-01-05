package AssingmentSet2;
//find the max length-word in a given string and return the max-length word. if two words are of same length return the first occuring word of max-length

public class Assingment14 {

	public static void main(String[] args) {

		String s = "hello how arettt you aaaaa";

		String[] a = s.split(" ");

		String n = " ";

		int max = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i].length() > max) {
				max = a[i].length();

				n = a[i];
			}

		}

		System.out.println(n + " is the longest word " + max + " are no. of charecters in it");

	}

}
