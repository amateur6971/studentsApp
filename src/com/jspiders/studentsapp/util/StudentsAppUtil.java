package com.jspiders.studentsapp.util;

import java.util.HashMap;

public class StudentsAppUtil {

	private static final HashMap<Integer, String> MONTHS 
							= new HashMap<Integer, String>();
	
	private static StudentsAppUtil ref = new StudentsAppUtil();
	
	private StudentsAppUtil() {
		MONTHS.put(1, "JAN");
		MONTHS.put(2, "FEB");
		MONTHS.put(3, "MAR");
		MONTHS.put(4, "APR");
		MONTHS.put(5, "MAY");
		MONTHS.put(6, "JUN");
		MONTHS.put(7, "JUL");
		MONTHS.put(8, "AUG");
		MONTHS.put(9, "SEP");
		MONTHS.put(10, "OCT");
		MONTHS.put(11, "NOV");
		MONTHS.put(12, "DEC");
	}
	
	public static StudentsAppUtil getInstance() {
		return ref;
	}
	
	public String getMonthName(int month) {
		return MONTHS.get(new Integer(month));
	}
	public String getMonthName(String month) {
		return getMonthName(Integer.parseInt(month));
	}
}
