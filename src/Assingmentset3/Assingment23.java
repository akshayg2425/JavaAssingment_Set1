package Assingmentset3;

public class Assingment23 {

	public static void main(String[] args) {

		String input1 = "hhh-ww--";
		String input2 = "rt--er--";

		boolean b = false;

		if ((input1.charAt(2) == '-') && (input1.charAt(3) == '-') && (input1.charAt(6) == '-')
				&& (input1.charAt(7) == '-')) {

			if ((input1.charAt(2) == input2.charAt(2)) && (input1.charAt(3) == input2.charAt(3))
					&& (input1.charAt(6) == input2.charAt(6)) && (input1.charAt(7) == input2.charAt(7))) {
				b = true;
			}
		}

		if (b == true) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
