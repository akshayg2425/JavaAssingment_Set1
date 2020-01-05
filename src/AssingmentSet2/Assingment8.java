package AssingmentSet2;

//Given date in dd-MM-yyyy format.return the month in full name format(January)

//input:"23-01-2012"
//output:January

import java.text.DateFormatSymbols;

public class Assingment8 {

	public static void main(String[] args) {

		int input = 23 - 01 - 2012;

		Assingment8 obj = new Assingment8();
		obj.getMonthForInt(5);

	}

	public void getMonthForInt(int num) {
		String month = "";
		DateFormatSymbols dfs = new DateFormatSymbols();
		String[] months = dfs.getMonths();
		int nume = num - 1;
		if (nume >= 0 && nume <= 11) {
			month = months[nume];
		}
		System.out.println(" Month is :" + month);

	}

}
