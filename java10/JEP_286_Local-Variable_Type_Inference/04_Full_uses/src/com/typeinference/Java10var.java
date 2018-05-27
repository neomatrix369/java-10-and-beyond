package com.typeinference;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
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

	public ZoneId zoneIdAraucaColombia = ZoneId.of( "GMT-5" );  // public var zoneIdAraucaColombia --> compilation error: 'var' is not allowed here
	public ZoneId zoneIdIstanbulTurkey = ZoneId.of( "GMT+3" );  // public var zoneIdIstanbulTurkey --> compilation error: 'var' is not allowed here
	public ZoneId zoneIdLondonUK = ZoneId.of( "GMT+1" );		// public var zoneIdLondonUK --> compilation error: 'var' is not allowed here

	public static void main(String args[]) {

		var java10var = new Java10var();	// Java10var java10var  --> You can use Local-Variable type inference here
		var numberss = List.of( 13L, 11L, 12L, 13L, 10L, 15L, 12L, 11L, 10L ); // List<Long> numberss --> You can use Local-Variable type inference here

		var average = java10var.average( numberss );	// Double average --> You can use Local-Variable type inference here
		System.out.println( "Average is: " + average );

		var first = java10var.getFirst( numberss );	// Long first  --> You can use Local-Variable type inference here
		System.out.println( "The first number in the list is: " + first );

		java10var.printTimes();

		printMonth();

		printNumbers();
	}

	public Double average(List<Long> numberss) {	// var average(var numberss) --> compilation error: 'var' is not allowed here
													// neither Double average nor List<Long>
		var average = 0D;	// Double average --> You can use Local-Variable type inference here
		var sum = numberss.stream().mapToDouble( p -> p ).sum();	// Double sum --> You can use Local-Variable type inference here
		average = sum / numberss.size();
		return average;
	}

	public Long getFirst(List<Long> numberss) {
		Long first;	// var first -->  compilation error: cannot infer type for local variable first
		first = numberss.get( 0 );
		return first;
	}

	public void printTimes() {
		var localDateTimeAraucaColombia = LocalDateTime.now( zoneIdAraucaColombia );	// LocalDateTime localDateTimeAraucaColombia --> You can use Local-Variable type inference here
		var localDateTimeIstanbulTurkey = LocalDateTime.now( zoneIdIstanbulTurkey );	// LocalDateTime localDateTimeIstanbulTurkey --> You can use Local-Variable type inference here
		var localDateTimeLondoUK = LocalDateTime.now( zoneIdLondonUK );				// LocalDateTime localDateTimeLondoUK --> You can use Local-Variable type inference here

		System.out.println( "Current time in Arauca - Colombia is: " + localDateTimeAraucaColombia );
		System.out.println( "Current time in Istanbul - Turkey is: " + localDateTimeIstanbulTurkey );
		System.out.println( "Current time in London - United Kingdom is: " + localDateTimeLondoUK );
	}

	public static void printMonth() {
		var monthValue = LocalDate.now().getMonthValue();	// int monthValue --> You can use Local-Variable type inference here
		String monthName;	// var monthName --> Compilation error error: cannot infer type for local variable monthName

		var months = new HashMap<Integer, String>();	// Map<Integer, String> months = new HashMap<>(); --> You can use Local-Variable type inference here
														// but it is necessary to change new HashMap<>() from new HashMap<Integer, String>();
		for(var month:Month.values()){	// Month month --> You can use Local-Variable type inference here
			months.put( month.getValue(), month.name() );
		}

		monthName = months.get( monthValue );

		System.out.println( "monthName: " + monthName );
	}

	public static void printNumbers() {
		List<String> myList = new ArrayList<>();	// var myList --> You can not use Local-Variable type inference here
													// because some lines ahead we are changing the type from List<String> to LinkedList<String>();

		myList.addAll( List.of("ONE","TWO","THREE","FIVE","SEVEN", "ELEVEN", "THIRTEEN", "SEVENTEEN" ) );

		System.out.println( myList );

		myList = new LinkedList<>();	// int monthValue --> You can use Local-Variable type inference here
		myList.addAll( List.of("1" , "2" , "3" , "5" , "7" , "11" , "13" , "17" ));

		System.out.println( myList );
	}
}
