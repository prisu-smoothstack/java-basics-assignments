package com.ss.lesson.four.test;

import junit.framework.*;
import com.ss.lesson.four.four.Line;

public class LineTest extends TestCase {
	Line l1 = new Line(0, 0, 1, 1);
	Line l2 = new Line(1, 1, 2, 2);
	
	public void testSlope() {
		//testing to see if line slopes are equal to 1
		assertEquals(1, l1.getSlope(), .0001);
		assertEquals(1, l2.getSlope(), .0001);
	}
	public void testDistance() {
		//Test to see if distance provides correct answer of sqrt of 2
		assertEquals(Math.sqrt(2), l1.getDistance(), .0001);
		assertEquals(Math.sqrt(2), l1.getDistance(), .0001);
	}
	public void testParalell() {
		//Check if lines are paralell
		assertTrue(l1.paralellTo(l2));
	}
}
