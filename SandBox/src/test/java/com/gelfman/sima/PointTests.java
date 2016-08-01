package com.gelfman.sima;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by sima.gelfman on 8/1/2016.
 */
public class PointTests {

	@Test
	public void testDistancePositive(){
		Point p1 = new Point ( 5, 6 );
		Point p2 = new Point ( 3, 4 );
		Assert.assertEquals ( p1.distance ( p2 ), 2.8284271247461900976033774484194);
	}

	@Test
	public void testDistanceNegative(){
		Point p1 = new Point ( 5, 6 );
		Point p2 = new Point ( 3, 4 );
		Assert.assertFalse ( p1.distance ( p2 ) == 2.8);
	}

}
