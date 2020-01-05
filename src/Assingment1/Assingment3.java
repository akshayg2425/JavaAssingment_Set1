package Assingment1;

//.A integer array is given as input. find the difference between each element. Return the index of the largest element which has the largest difference gap.

//input: {2,3,4,2,3}

public class Assingment3 {

	public static void main(String[] args) {
		int diff = 0;
		int temdeff = 0;

		int index = 0;

		int[] array = { 2, 3, 4, 2, 3 };

		for (int i = 0; i < array.length - 1; i++) {
			temdeff = array[i] - array[i + 1];
			int D = Math.abs(temdeff);

			if (D >= diff) {
				diff = D;
				index = i;
			}

		}

		System.out.println(
				"Max diffrence between two elements in is ------ " + diff + " ------ And its index is ----> " + index);

	}

}
