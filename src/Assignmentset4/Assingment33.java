package Assignmentset4;

public class Assingment33 {

	public static void main(String[] args) {

		String s = "AKSH1@ee";

		boolean b1 = false;
		boolean b2 = false;

		if (Character.isUpperCase(s.charAt(0))) {
			if (Character.isLowerCase(s.charAt(s.length() - 1))) {
				if (s.length() >= 6 && s.length() <= 20) {
					for (int i = 0; i < s.length(); i++) {
						char c = s.charAt(i);

						if (Character.isDigit(c)) {
							b1 = true;
							break;
						}

					}
					int x = 0;
					int y = 0;

					for (int i = 0; i < s.length(); i++) {
						if (Character.isUpperCase(s.charAt(i))) {
							System.out.println(s.charAt(i));
							x++;
						}

						if (Character.isLowerCase(s.charAt(i))) {
							System.out.println(s.charAt(i));
							y++;
						}
					}
					if (b1 == true) {
						if (x > y) {
							for (int i = 0; i < s.length(); i++) {
								char c = s.charAt(i);

								if (c == '#' || c == '@' || c == '$') {
									b2 = true;
								}
							}
						}
					}

				}
			}

		}

		if (b2 == true) {
			System.out.println("No. is Validd!!");
		} else {
			System.out.println("no. is not Valid!!");
		}

	}

}
