package com.gelfman.sima;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by sima.gelfman on 8/1/2016.
 */
public class SquareTests {
	@Test
	public void testAreaPositive(){
		Square sq = new Square ( 6 );
		Assert.assertEquals ( sq.area (), 36.0 );
	}

	@Test
	public void testAreaNegative(){
		Square sq = new Square ( 6 );
		Assert.assertFalse ( sq.area () == 36.1);
	}

}
