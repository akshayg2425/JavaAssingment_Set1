package Assingmentset3;

//Get two integer arrays as input. Find if there are common elements in the arrays. find the number of common elements
public class Assingment22 {

	public static void main(String[] args) {

		int[] one = { 1, 2, 3, 4 };

		int[] two = { 3, 4, 5, 6 };

		int count = 0;

		for (int i = 0; i < one.length; i++) {
			for (int j = 0; j < two.length; j++) {
				if (one[i] == two[j]) {
					count++;

				}

			}

		}

		System.out.println("No. of coom elements are " + count);

	}

}
