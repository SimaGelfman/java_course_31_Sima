package com.gelfman.sima;

/**
 * Created by sima.gelfman on 7/31/2016.
 */
public class Point {
	private double x;
	private double y;

	public Point ( double x, double y ) {
		this.x = x;
		this.y = y;
	}

	public void setX ( double x ) {
		this.x = x;
	}

	public void setY ( double y ) {
		this.y = y;
	}

	public double getX () {

		return x;
	}

	public double getY () {
		return y;
	}

	public String getPoint () {
		return "(" + x + " , " + y + ")";
	}

	public double distance ( Point p2 ) {
		return Math.sqrt ( ((p2.getX () - this.x) * (p2.getX () - this.x)) + ((p2.getY () - this.y) * (p2.getY () - this.y)) );
	}

}
