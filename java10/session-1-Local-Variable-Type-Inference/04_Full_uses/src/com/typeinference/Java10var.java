package com.typeinference;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
* This class has some variable declarations that can't be changed for Java 10 type inference way,
* you should try to change whichever you think can use var, and then compile to check if your changes are correct
* */
public class Java10var {

	public ZoneId zoneIdAraucaColombia = ZoneId.of( "GMT-5" );
	public ZoneId zoneIdIstanbulTurkey = ZoneId.of( "GMT+3" );
	public ZoneId zoneIdLondonUK = ZoneId.of( "GMT+1" );

	public static void main(String args[]) {

		Java10var java10var = new Java10var();
		List<Long> numberss = List.of( 13L, 11L, 12L, 13L, 10L, 15L, 12L, 11L, 10L );

		Double average = java10var.average( numberss );
		System.out.println( "Average is: " + average );

		Long first = java10var.getFirst( numberss );
		System.out.println( "The first number in the list is: " + first );

		java10var.printTimes();

		printMonth();

		printNumbers();
	}

	public Double average(List<Long> numberss) {
		Double average = 0D;
		Double sum = numberss.stream().mapToDouble( p -> p ).sum();
		average = sum / numberss.size();
		return average;
	}

	public Long getFirst(List<Long> numberss) {
		Long first;
		first = numberss.get( 0 );
		return first;
	}

	public void printTimes() {
		LocalDateTime localDateTimeAraucaColombia = LocalDateTime.now( zoneIdAraucaColombia );
		LocalDateTime localDateTimeIstanbulTurkey = LocalDateTime.now( zoneIdIstanbulTurkey );
		LocalDateTime localDateTimeLondoUK = LocalDateTime.now( zoneIdLondonUK );

		System.out.println( "Current time in Arauca - Colombia is: " + localDateTimeAraucaColombia );
		System.out.println( "Current time in Istanbul - Turkey is: " + localDateTimeIstanbulTurkey );
		System.out.println( "Current time in London - United Kingdom is: " + localDateTimeLondoUK );
	}

	public static void printMonth() {
		int month = LocalDate.now().getMonthValue();
		String monthString;

		Map<Integer, String> months = new HashMap<>();
		months.put( 1, "January" );
		months.put( 2, "February" );
		months.put( 3, "March" );
		months.put( 4, "April" );
		months.put( 5, "May" );
		months.put( 6, "June" );
		months.put( 7, "July" );
		months.put( 8, "August" );
		months.put( 9, "September" );
		months.put( 10, "October" );
		months.put( 11, "November" );
		months.put( 12, "December" );

		monthString = months.get( month );

		System.out.println( "monthString: " + monthString );
	}

	public static void printNumbers() {
		List<String> myList = new ArrayList<>();

		myList.add( "ONE" );
		myList.add( "TWO" );
		myList.add( "THREE" );
		myList.add( "FIVE" );
		myList.add( "SEVEN" );
		myList.add( "ELEVEN" );
		myList.add( "THIRTEEN" );
		myList.add( "SEVENTEEN" );
		myList.add( "NINETEEN" );

		System.out.println( myList );

		myList = new LinkedList<>();

		myList.add( "1" );
		myList.add( "2" );
		myList.add( "3" );
		myList.add( "5" );
		myList.add( "7" );
		myList.add( "11" );
		myList.add( "13" );
		myList.add( "17" );
		myList.add( "19" );

		System.out.println( myList );
	}
}
