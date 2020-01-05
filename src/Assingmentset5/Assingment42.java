package Assingmentset5;

public class Assingment42 {

	public static void main(String[] args) {

		String input = "education";

		StringBuffer sb = new StringBuffer();

		sb.append(input.charAt(0));

		for (int i = 1; i < input.length(); i++) {

			char c = input.charAt(i);
			if (c != 'e' && c != 'o' && c != 'E' && c != 'O') {
				sb.append(c);
			}
		}

		System.out.println(sb);
	}
}
