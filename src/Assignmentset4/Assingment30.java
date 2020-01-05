package Assignmentset4;

import java.text.ParseException;

//Find the number of days between two input dates.

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Assingment30 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd mm yyyy");

		String input1 = "24 04 1995";

		String input2 = "27 04 1994";

		Date date1 = sdf.parse(input1);

		Date date2 = sdf.parse(input2);

		long diff = Math.abs(date2.getTime() - date1.getTime());

		System.out.println("Days are " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));

	}

}
