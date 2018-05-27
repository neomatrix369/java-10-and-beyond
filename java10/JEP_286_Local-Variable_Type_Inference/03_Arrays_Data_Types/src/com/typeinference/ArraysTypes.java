package com.typeinference;

import java.util.Random;

public class ArraysTypes {

	public static void main(String[] args) {
		String[] animalss = new String[3];

		animalss[0] = "DOG";
		animalss[1] = "CAT";
		animalss[2] = "MOUSE";

		for ( String animal : animalss ) {
			System.out.println( animal );
		}

		String[][] names = new String[][] {
				{ "Mr. ", "Mrs. ", "Ms. " },
				{ "Bean", "Krabappel" }
		};
		// Mr. Bean
		String mrBean = names[0][0] + names[1][0];
		System.out.println( mrBean );

		// Ms.
		String msKrabappel = names[0][2] + names[1][1];
		System.out.println( names[0][2] + names[1][1] );

		Hero[] heroes = new Hero[]{
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

		Random rand = new Random(  );
		Hero bestHero = heroes[rand.nextInt( 9 )];

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
