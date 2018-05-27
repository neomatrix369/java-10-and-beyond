package com.typeinference;

public class PrimitiveTypes {

	public static void main(String[] args) {

		var years = 37; // int years = 37; You can use Local-Variable type inference to this declaration
		var gender = 'M'; // var gender = 'M'; You can use Local-Variable type inference to this declaration

		if ( gender == 'M' ) {
			System.out.println( "Hi Mister, you're " + years + " old " );
		}
		else if ( gender == 'F' ) {
			System.out.println( "Hi Miss, you're " + years + " old " );
		}
		else {
			System.out.println( "Hi, you're " + years + " old " );
		}

		var totalPayment = 6200D; 	// double totalPayment = 6200; You can use Local-Variable type inference to this declaration, but it is necessary
									// define the number as a Double using either 6200D or new Double(6200)
		var days = 85; // int days = 85; You can use Local-Variable type inference to this declaration d

		double value = totalPayment / days;  // double value = totalPayment / days; You can use Local-Variable type inference to this declaration

		System.out.println( "Last month you earned $ " + value + " per day " );

		// You can use Local-Variable type inference to this declaration to declare a for variable and and boolean-type
		for ( var i = 0; i < 10; i++ ) {

			var isEven = i % 2 == 0;

			if ( isEven ) {
				System.out.println( i + " is an even number " );
			}
			else {
				System.out.println( i + " is an odd number " );
			}

		}

	}
}