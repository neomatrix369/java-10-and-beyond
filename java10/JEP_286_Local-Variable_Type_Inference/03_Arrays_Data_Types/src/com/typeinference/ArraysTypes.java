package com.typeinference;

import java.util.Random;

public class ArraysTypes {

	public static void main(String[] args) {
		var animalss = new String[3]; // String[] animalss --> You can use Local-Variable type inference here

		animalss[0] = "DOG";
		animalss[1] = "CAT";
		animalss[2] = "MOUSE";

		for ( var animal : animalss ) { // String animal  --> You can use Local-Variable type inference here
			System.out.println( animal );
		}

		var names = new String[][] { // String[][] names  --> You can use Local-Variable type inference here
				{ "Mr. ", "Mrs. ", "Ms. " },
				{ "Bean", "Krabappel" }
		};
		// Mr. Bean
		var mrBean = names[0][0] + names[1][0]; // String mrBean --> You can use Local-Variable type inference here
		System.out.println( mrBean );

		// Ms.
		var msKrabappel = names[0][2] + names[1][1]; // String msKrabappel --> You can use Local-Variable type inference here
		System.out.println( names[0][2] + names[1][1] );

		var heroes = new Hero[]{ // Hero[] heroes --> You can use Local-Variable type inference to this declaration
				new Hero( "Spiderman" ),
				new Hero( "Batman" ),
				new Hero( "American Captain" ),
				new Hero( "Deadpool" ),
				new Hero( "Iron Man" ),
				new Hero( "Luke Skywalker" ),
				new Hero( "Black Panther" ),
				new Hero( "Superman" ),
				new Hero( "Wonder Woman" ),
				new Hero( "Duke" ),
		};

		var rand = new Random(  ); // Random rand --> You can use Local-Variable type inference here
		var bestHero = heroes[rand.nextInt( 9 )]; // Hero bestHero --> You can use Local-Variable type inference here

		System.out.println("and the best hero is ... ");
		System.out.println(bestHero.getName() );


		//Checking objects' class
		System.out.println( " " );
		System.out.println( "animalss is an instance of " + animalss.getClass() );
		System.out.println( "names is an instance of " + names.getClass() );
		System.out.println( "mrBean is an instance of " + mrBean.getClass() );
		System.out.println( "msKrabappel is an instance of " + msKrabappel.getClass() );
		System.out.println( "heroes is an instance of " + heroes.getClass() );
		System.out.println( "bestHero is an instance of " + bestHero.getClass() );
	}
}
