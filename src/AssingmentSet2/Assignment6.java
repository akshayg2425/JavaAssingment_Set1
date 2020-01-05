package AssingmentSet2;

// Sum of fibonaaci series upto given input.

public class Assignment6 {

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		int temp = 0;

		int input = 3;

		
		for (int i = 2; i <= input; i++) {
			temp = n1 + n2;

			

			/*n1 = n2;
			n2 = temp;*/

		}
		
		System.out.println(n1 + " " + n2 + " " + temp );

	}

}
