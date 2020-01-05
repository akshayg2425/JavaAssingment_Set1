package Assingmentset3;

//incomplete
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Assigment19 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the date");

		String s1 = s.nextLine();

		boolean b = false;

		StringTokenizer st = new StringTokenizer(s1, "/");

		int n1 = Integer.parseInt(st.nextToken());

		int n2 = Integer.parseInt(st.nextToken());

		String s2 = st.nextToken();

		int n3 = s2.length();

		int n4 = Integer.parseInt(s2);

		if (n3 == 4) {
			if (n4 % 4 == 0) {
				if ((n2 == 2) && (n1 <= 29)) {
					b = true;
				} else if ((n2 == 4) || (n2 == 6) || (n2 == 9) || (n2 == 11) && (n1 <= 30)) {
					b = true;
				} else if ((n2 == 1) || (n2 == 3) || (n2 == 5) || (n2 == 7) || (n2 == 8) || (n2 == 10)
						|| (n2 == 12) && (n1 <= 31)) {
					b = true;
				}

			}

			else {
				if ((n2 == 2) && (n1 <= 28)) {
					b = true;
				} else if ((n2 == 4) || (n2 == 6) || (n2 == 9) || (n2 == 11) && (n1 <= 30)) {
					b = true;
				} else if ((n2 == 1) || (n2 == 3) || (n2 == 5) || (n2 == 7) || (n2 == 8) || (n2 == 10)
						|| (n2 == 12) && (n1 <= 31)) {
					b = true;
				}
			}

		}

		if (b == true) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
