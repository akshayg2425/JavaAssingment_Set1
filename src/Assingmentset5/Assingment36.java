package Assingmentset5;

//find the three consecutive characters in a string. if the string consists any three 

//consecutive characters return 1 else return -1

public class Assingment36 {

	public static void main(String[] args) {

		String s = "AAxyaaaa";
		int count = 0;

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i + 1) - s.charAt(i) == 1) {
				count++;
			}
		}
		if (count >= 2) {
			System.out.println(1);
		} else {
			System.out.println(-1);
		}

	}
}
