package Assingment1;

///Given two integer arrays. merge the common elements into a new array. find the sum of the elements

public class Assingment4 {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4 };
		int[] array2 = { 3, 4, 5, 6 };

		int[] comnelmt = new int[array1.length];

		int sum = 0;
		int t = 0;

		for (int i = 0; i < array1.length; i++) {

			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {

					comnelmt[t] = array1[i];

					sum = sum + comnelmt[t];
					t++;
					System.out.println(t);
				}

			}

		}

		for (int p = 0; p < comnelmt.length; p++) {
			System.out.println("result array is" + comnelmt[p]);
		}
		System.out.println("The sum of the array element is" + sum);

	}

}
