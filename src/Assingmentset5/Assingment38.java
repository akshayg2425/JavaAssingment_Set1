package Assingmentset5;

//Retrieve the max from array which is in a odd-index

public class Assingment38 {

	public static void main(String[] args) {

		int[] input = { 10, 20, 30, 40, 50, 60, 70 };

		int max = input[1];

		for (int i = 2; i < input.length; i++) {
			if (i % 2 != 0) {
				if (input[i] > max) {
					max = input[i];

				}

			}

		}

		System.out.println(max);

	}

}
