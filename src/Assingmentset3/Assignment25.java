package Assingmentset3;

//incomplte
import java.util.Iterator;
import java.util.Scanner;

public class Assignment25 {

	public static void main(String[] args) {

		String input;

		int count = 0;

		String rev = "";
		char c1 = 0;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the String");

		input = s.nextLine();

		int length = input.length();

		for (int i = length - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);

			char c = input.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				char temp = c1;
				c1 = c;

				if (temp != c1) {
					count++;
				}

			}

		}

		if (input.equals(rev)) {
			System.out.println("String is Palindrome");

			if ((count - 1) > 0) {
				System.out.println(" There are diffrent vowels in pallindrome string");
			}

			else {

				System.out.println("No diffrent vowels in pallindrome string");
			}
		} else {
			System.out.println("String is not pallindrome");
		}

	}

}
