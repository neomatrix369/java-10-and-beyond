package com.typeinference;

import java.util.Arrays;
import java.util.List;

public class ObjectTypes {

	public static void main(String[] args) {

		var years = 37; // Integer years --> You can use Local-Variable type inference here
		var gender = "FEMALE"; // String gender --> You can use Local-Variable type inference heren

		if ( gender.equals( "MALE" ) ) {
			System.out.println( "Hi Mister, you're " + years + " old " );
		}
		else if ( gender.equals( "FEMALE" ) ) {
			System.out.println( "Hi Miss, you're " + years + " old " );
		}
		else {
			System.out.println( "Hi, you're " + years + " old " );
		}

		Double totalPayment = 6200D; // Double totalPayment --> You can use Local-Variable type inference heren
									// but the type inferred will be a double primitive, as we are going to call the method totalPayment.getClass()
									// you can change Long for var
		Long days = 85L; // Long days --> You may use Local-Variable type inference heren
						// but the type inferred will be a double primitive, as we are going to call the method days.getClass()
						// you can change Long for var

		Double value = totalPayment / days;  	// Double value --> You may use Local-Variable type inference heren
												// but the type inferred will be a double primitive

		System.out.println( "Last month you earned $ " + value + " per day " );

		var theLordOfTheRings = new Book("The Lord Of The Rings", 19.99); // Book theLordOfTheRings --> You can use Local-Variable type inference heren
		var centralPark = new Store( "Central Park"); // Store centralPark --> You can use Local-Variable type inference heren

		System.out.println( "Your favorite book " + theLordOfTheRings + ", is available in our store " + centralPark.getName() );


		var animalss = Arrays.asList( "DOG", "CAT", "MOUSE");   // List<String> animalss --> You can use Local-Variable type inference to this declaration
																// but you can not say List<var> animalss

		System.out.println(animalss);

		//Checking objects' class
		System.out.println( " " );
		System.out.println( "totalPayment is an instance of " + totalPayment.getClass() );
		System.out.println( "days is an instance of " + days.getClass() );
		System.out.println( "value is an instance of " + value.getClass() );
		System.out.println( "theLordOfTheRings is an instance of " + theLordOfTheRings.getClass() );
		System.out.println( "centralPark is an instance of " + centralPark.getClass() );
		System.out.println( "animalss is an instance of " + animalss.getClass() );
	}
}