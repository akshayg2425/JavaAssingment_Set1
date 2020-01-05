package AssingmentSet2;

//Retrieve the odd numbers till given input number. add and subtract it consecutively and return the result.

public class Assignment7 {

	public static void main(String[] args) {
		int a = 9;

		int sum = 1;

		boolean b = true;

		for (int i = 3; i <= a; i++) {
			if (i % 2 != 0) {

				if (b == true) {

					sum = sum + i;
        System.out.println(sum);
					
					b = false;
				} else {
					sum = sum - i;

					System.out.println(sum);
					b = true;
				}

			}

		}

		
		System.out.println("Sum of Odd no. is" + sum);

	}

}
