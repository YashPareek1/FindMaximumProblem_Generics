package com;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FindMaximumTest {

	@Test
	public void testMaximumIntegerAtFirst() {
		Assert.assertEquals((Integer)8, FindMaximum.testMax(8, 4, 7));	
	}
	@Test
	public void testMaximumIntegerAtSecond() {
		Assert.assertEquals((Integer)20, FindMaximum.testMax(4, 20, 7));	
	}
	@Test
	public void testMaximumIntegerAtThird() {
		Assert.assertEquals((Integer)45, FindMaximum.testMax(4, 20, 45));	
	}
	
	@Test
	public void testMaximumFloatAtFirst() {
		Assert.assertEquals((Float)4.6f, FindMaximum.testMax(4.6f, 4.5f, 2.6f));	
	}
	@Test
	public void testMaximumFloatAtSecond() {
		Assert.assertEquals((Float)5.2f, FindMaximum.testMax(4.6f, 5.2f, 1.7f));	
	}
	@Test
	public void testMaximumFloatrAtThird() {
		Assert.assertEquals((Float)9.9f, FindMaximum.testMax(4.8f, 8.0f, 9.9f));	
	}
	
	@Test
	public void testMaximumStringAtFirst() {
		Assert.assertEquals("tiger", FindMaximum.testMax("tiger", "lion", "elephant"));	
	}
	@Test
	public void testMaximumStringAtSecond() {
		Assert.assertEquals("tiger", FindMaximum.testMax("elephant","tiger", "lion"));	
	}
	@Test
	public void testMaximumStringAtThird() {
		Assert.assertEquals("tiger", FindMaximum.testMax("lion", "elephant", "tiger"));	
	}
    
}
