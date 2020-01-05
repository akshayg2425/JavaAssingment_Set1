package Assingmentset5;

public class Assingment43 {

	public static void main(String[] args) {

		int[] input = { 11, 22, 33, 44, 55 };

		int sum = 0;

		for (int i = 0; i < input.length; i++) {

			if (i % 2 != 0) {
				sum += input[i] * i;
				
				System.out.println(sum);

			}

		}

		System.out.println(sum);

	}

}
