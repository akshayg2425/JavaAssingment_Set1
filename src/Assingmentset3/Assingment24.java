package Assingmentset3;

//Input a int array. Square the elements in even position and cube the elements in odd position and add them as result

public class Assingment24 {

	public static void main(String[] args) {

		int[] input = { 1, 2, 3, 4 };
		int sum = 0;

		for (int i = 0; i < input.length; i++) {
			if (i % 2 != 0) {
				sum = sum + (input[i] * input[i] * input[i]);

			}

			else {
				sum = sum + (input[i] * input[i]);

			}

		}

		System.out.println("Output result is " + sum);

	}

}
