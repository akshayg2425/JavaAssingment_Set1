package Assingment1;
/*A number is given as input. Find the odd digits in the number, add them and find if the sum is odd or not.if even return -1, if odd return 1*/

public class Assingment1 {

	public static void main(String[] args) {

		int n = 2335411;
		int odd_count = 0;

		while (n > 0) {
			int rem = n % 10;
			if (rem % 2 != 0)
				odd_count = odd_count + rem;

			n = n / 10;
		}
		System.out.println("sum of odd no  count  is : " + odd_count);

		if (odd_count % 2 == 0)
			System.out.println(-1);
		else
			System.out.println(1);
	}

}
