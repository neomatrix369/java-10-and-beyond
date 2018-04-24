package com.typeinference;

public class PrimitiveTypes {

	public static void main(String[] args) {

		int years = 37; // this primitive var declaration should be changed
		char gender = 'M'; // this primitive var declaration should be changed

		if ( gender == 'M' ) {
			System.out.println( "Hi Mister, you're " + years + " old " );
		}
		else if ( gender == 'F' ) {
			System.out.println( "Hi Miss, you're " + years + " old " );
		}
		else {
			System.out.println( "Hi, you're " + years + " old " );
		}

		double totalPayment = 6200; // this primitive var declaration should be changed, it might be necessary to make a little change
		int days = 85; // this primitive var declaration should be changed

		double value = totalPayment / days;  // this primitive var declaration should be changed

		System.out.println( "Last month you earned $ " + value + " per day " );

		for ( int i = 0; i < 10; i++ ) {

			boolean isEven = i % 2 == 0;

			if ( isEven ) {
				System.out.println( i + " is an even number " );
			}
			else {
				System.out.println( i + " is an odd number " );
			}

		}

	}
}