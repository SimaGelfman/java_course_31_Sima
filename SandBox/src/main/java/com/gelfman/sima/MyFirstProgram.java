package com.gelfman.sima;

public class MyFirstProgram {

	public static void main ( String[] args ) {

		hello ( "World" );
		hello ( "User" );


		Square s = new Square ( 5 );
		System.out.println ( "The area of a square with side " + s.getL () + " = " + s.area () );
		s.setL ( 10 );
		System.out.println ( "The area of a square with side " + s.getL () + " = " + s.area () );

		Rectangle r = new Rectangle ( 4, 6 );
		System.out.println ( "The area of a rectangle with sides " + r.getA () + " and " + r.getB () + " = " + r.area () );
		r.setA ( 8 );
		r.setB ( 6 );
		System.out.println ( "The area of a rectangle with sides " + r.getA () + " and " + r.getB () + " = " + r.area () );


	}

	public static void hello ( String somebody ) {
		System.out.println ( "Hello, " + somebody + "!" );
	}

}