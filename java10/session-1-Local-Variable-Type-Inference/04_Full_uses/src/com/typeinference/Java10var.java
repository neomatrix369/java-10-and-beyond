package com.typeinference;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
		switch ( month ) {
			case 1:
				monthString = "January";
				break;
			case 2:
				monthString = "February";
				break;
			case 3:
				monthString = "March";
				break;
			case 4:
				monthString = "April";
				break;
			case 5:
				monthString = "May";
				break;
			case 6:
				monthString = "June";
				break;
			case 7:
				monthString = "July";
				break;
			case 8:
				monthString = "August";
				break;
			case 9:
				monthString = "September";
				break;
			case 10:
				monthString = "October";
				break;
			case 11:
				monthString = "November";
				break;
			case 12:
				monthString = "December";
				break;
			default:
				monthString = "Invalid month";
				break;
		}
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
