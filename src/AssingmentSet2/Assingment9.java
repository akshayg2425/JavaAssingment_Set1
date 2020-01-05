package AssingmentSet2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//Two dates are given as input in "yyyy-MM-dd" format. Find the number of months between the two dates

public class Assingment9 {

	public static void main(String[] args) throws ParseException {

		System.out.println("The No. of months between two dates is : " + MonthDiffr());

	}

	public static int MonthDiffr() throws ParseException {

		String a1 = "2019-01-01";
		String a2 = "2018-12-31";
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");

		Calendar c = Calendar.getInstance();

		Date d1 = s.parse(a1);
		Date d2 = s.parse(a2);

		c.setTime(d1);

		int m1 = c.get(Calendar.MONTH);
		int y1 = c.get(Calendar.YEAR);

		c.setTime(d2);

		int m2 = c.get(Calendar.MONTH);
		int y2 = c.get(Calendar.YEAR);

		int n = (y1 - y2) * 12 + (m1 - m2);
		return n;
	}

}
