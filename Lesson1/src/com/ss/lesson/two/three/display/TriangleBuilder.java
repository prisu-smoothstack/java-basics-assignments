/**
 * 
 */
package com.ss.lesson.two.three.display;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 * @author Space Prius
 *
 */
public class TriangleBuilder {


	void drawMethod(Graphics2D g2d, int x, int y, int xpos[], int[] ypos) {
		// TODO Auto-generated method stub
		g2d.drawPolygon(xpos, ypos, 3);
		
	}
	
	/**
	 * Constructor constructs the triangle loop.
	 * @param width
	 * @param height
	 * @param x
	 * @param y
	 */
	public void draw(int[] xdraw, int[] ydraw, int width, int x, int y) {
		BufferedImage buffer = new BufferedImage(width, width, BufferedImage.TYPE_INT_RGB);
		Graphics graphics = buffer.getGraphics();
		Graphics2D g2d = (Graphics2D)graphics;
		
		int xs[] = xdraw;
		int ys[] = ydraw;
		int w = width;
		drawMethod(g2d, x, y, xs, ys);
		for (int n = 0; n< width; n++) {
			StringBuilder stringBuilder = new StringBuilder();
			
			for (int j = 0; j < width; j++) {
				stringBuilder.append(buffer.getRGB(n, j) == -16777216 ? "*" : " ");
			}
			
			if (stringBuilder.toString().trim().isEmpty()) {
				continue;
			}
			
			System.out.println(stringBuilder);
		}
		
	}
		
	}

