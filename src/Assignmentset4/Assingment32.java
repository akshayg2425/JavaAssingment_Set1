package Assignmentset4;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Assingment32 {

	public static void main(String[] args) {

		String s = "ahyhay";

		StringBuffer sb = new StringBuffer(s);

		for (int i = 0; i < sb.length(); i++) {

			for (int j = i + 1; j < sb.length(); j++) {

				if (sb.charAt(i) == sb.charAt(j)) {
					sb.deleteCharAt(j);
				}
			}
		}

		System.out.println(sb);

	}

}
