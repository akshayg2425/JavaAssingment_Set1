package Assignmentset4;

import java.util.ArrayList;
import java.util.List;

public class Assingmetn29 {

	public static void main(String[] args) {

		int arr[] = { 10, 10, 20, 30, 76 };

		int input = 10;

		List<Integer> l1 = new ArrayList<Integer>();

		List<Integer> l2 = new ArrayList<>();

		l2.add(input);

		for (int i = 0; i < arr.length; i++) {
			l1.add(arr[i]);
		}

		l1.removeAll(l2);

		System.out.println(l1);
	}
}