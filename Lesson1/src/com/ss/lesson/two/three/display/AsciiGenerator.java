package com.ss.lesson.two.three.display;
import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;


/**
 * handles displaying shapes in an ascii format
 * @author eStringer
 *
 */
abstract class AsciiGenerator {
	public abstract void drawMethod(Graphics2D g2d, int x, int y, int width, int height);
	public void draw(int width, int height, int x, int y) {
		BufferedImage buffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics graphics = buffer.getGraphics();
		Graphics2D g2d = (Graphics2D)graphics;
		int xpos = x;
		int ypos = y;
		int h = height;
		int w = width;
		drawMethod(g2d, x, y, h, w);
		for (int n = 0; n< height; n++) {
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

