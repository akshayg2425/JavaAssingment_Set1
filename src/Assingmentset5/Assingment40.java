package Assingmentset5;

/*input1="Rajasthan";
input2=2;
input3=5;
output=hts;*/

public class Assingment40 {

	public static void main(String[] args) {

		String s = "Rajasthan";

		StringBuffer sb = new StringBuffer();
		sb.append(s);

		StringBuffer sb2 = new StringBuffer();

		sb2 = sb.reverse();

		System.out.println(sb2.substring(2, 5));

	}

}
