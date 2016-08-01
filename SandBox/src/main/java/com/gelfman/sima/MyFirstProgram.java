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

		Point p1 = new Point ( 2, 3 );
		Point p2 = new Point ( 1, 2 );
		System.out.println ( "The distance between " + p1.getPoint () + " and " + p2.getPoint () + " = " + distance ( p1, p2 ) );

		System.out.println ( "The distance between " + p1.getPoint () + " and " + p2.getPoint () + " = " + p1.distance ( p2 ) );


	}

	public static void hello ( String somebody ) {
		System.out.println ( "Hello, " + somebody + "!" );
	}

	public static double distance ( Point p1, Point p2 ) {
		return Math.sqrt ( (p2.getX () - p1.getX ()) * (p2.getX () - p1.getX ())
						+ (p2.getY () - p1.getY ()) * (p2.getY () - p1.getY ()) );
	}

}