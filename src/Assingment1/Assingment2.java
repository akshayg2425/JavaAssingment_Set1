package Assingment1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Assingment2 {

	public static void main(String[] args) throws ParseException {

		String input = "01-01-2020";

		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");

		Date d1 = sdf.parse(input);

		DateFormat df = new SimpleDateFormat("EEEE");

		String s = df.format(d1);

		System.out.println(s);
	}

}
