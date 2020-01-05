package Assignmentset4;

//An arraylist of Strings is given as input. The count of the String elements that are not of size input2 string is to be returned.

public class Assingment28 {

	public static void main(String[] args) {

		String[] input = { "aaa", "bb", "cccc", "d" };

		String input2 = "bb";

		int count = 0;

		for (int i = 0; i < input.length; i++) {

			if (input[i].length() != input2.length()) {

				count++;
			}
		}

		System.out.println("The non same length charecters are " + count + " " + input2 + " " + input2.length());

	}

}
