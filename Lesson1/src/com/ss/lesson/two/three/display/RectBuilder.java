/**
 * 
 */
package com.ss.lesson.two.three.display;

import java.awt.Graphics2D;

/**
 * @author Space Prius
 *
 */
public class RectBuilder extends AsciiGenerator {

	/**
	 * @param width
	 * @param height
	 * @param x
	 * @param y
	 */

	@Override
	public void drawMethod(Graphics2D g2d, int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		g2d.drawRect(x, y, width, height);
	}
	
	public void draw(int width, int height, int x, int y) {
		super.draw(width, height, x, y);
	}

}
