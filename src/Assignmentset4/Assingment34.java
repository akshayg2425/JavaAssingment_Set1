package Assignmentset4;

//find the average of the maximum and minimum number in an integer array

public class Assingment34 {

	public static void main(String[] args) {

		int[] input_array = { 10, 20, 30, 40, 50 };

		int max = input_array[0];

		int min = input_array[0];

		for (int i = 1; i < input_array.length; i++) {

			if (input_array[i] > max) {
				max = input_array[i];
			} else if (input_array[i] < min) {
				min = input_array[i];

			}

		}
		System.out.println(max);

		System.out.println(min);

		int avrage = (max + min) / 2;
		System.out.println(avrage);

	}
}
