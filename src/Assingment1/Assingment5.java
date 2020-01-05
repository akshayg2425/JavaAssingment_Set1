package Assingment1;

import java.util.Scanner;

//.Given two arrays. retrieve the odd position elements form first input and even position elemetns from second list. 
//put it into the new arraylist at the same positions from where they are retrieved from.

public class Assingment5 {

	public static void main(String[] args) {
		 int[] array1 = {12,1,32,3};
		/*Scanner s = new Scanner(System.in);

		int[] array1 = new int[4];
		System.out.println("Enter the elemnets in array1");
		
		 for (int i = 0; i < array1.length; i++) {
			array1[i] = s.nextInt();
		}
*/
		int[] array2 = { 0, 12, 2, 23 };
		int[] newarray = new int[array1.length];
		
		int n = 0;
		
		for (int i = 1; i < array1.length; i++) {

			if (i % 2 != 0) {
				n = i;
				newarray[n] = array1[i];

			}

		}

		for (int j = 0; j < array2.length; j++) {
			if (j % 2 == 0) {
				n = j;
				newarray[j] = array2[j];

			}

		}

		for (int p = 0; p < newarray.length; p++) {

			System.out.println("o/p elments are" + newarray[p]);

		}

	}

}
