package com.spring.daydiff.util;

public class DateDiffUtil {

	public static String evaluate(String toDate, String fromDate) {

		final String splitChar = "-";
		JulianInterface julianNumInterf = (dateString) -> {

			String[] arrSplitDate = dateString.split(splitChar);

			int year = Integer.parseInt(arrSplitDate[2]);
			int month = Integer.parseInt(arrSplitDate[1]);
			int day = Integer.parseInt(arrSplitDate[0]);

			// Formula to calculate Julian Day Number for a given date
			// https://quasar.as.utexas.edu/BillInfo/JulianDatesG.html
			if (month > 0 && month <= 2) {
				year = year - 1;
				month = month + 12;
			}
			double jdn = (2 - year / 100 + year / 100 / 4) + day + (365.25 * (year + 4716)) + (30.6001 * (month + 1))
					- 1524.5;
			return jdn;
		};

		Double numOfDays = Math.ceil(julianNumInterf.julianDay(toDate) - julianNumInterf.julianDay(fromDate));

		return Double.toString(numOfDays);
	}

}
