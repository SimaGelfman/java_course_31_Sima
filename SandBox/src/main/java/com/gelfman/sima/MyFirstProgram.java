package com.gelfman.sima;

public class MyFirstProgram {

	public static void main ( String[] args ) {

		hello ( "World" );
		hello( "User" );

		double l = 5;
		System.out.println ( "The area of a square with side " + l + " = " + area ( l ) );

		double a = 4;
		double b = 5;
		System.out.println ( "The area of a rectangle with sides " + a + " and " + "b" + " = " + area ( a,b ) );



	}

	public static void hello ( String somebody ) {
		System.out.println ( "Hello, " + somebody + "!" );
	}

	public static double area(double l){
		return l * l;
	}

	public static  double area(double a, double b){
		return a * b;
	}


}