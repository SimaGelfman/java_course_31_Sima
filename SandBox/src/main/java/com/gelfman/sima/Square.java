package com.gelfman.sima;

/**
 * Created by sima.gelfman on 7/31/2016.
 */
public class Square {
	private double l;

	public Square ( double len ) {
		l = len;
	}

	public void setL ( double l ) {
		this.l = l;
	}

	public double getL () {
		return l;
	}

	public double area () {
		return l * l ;
	}

}
