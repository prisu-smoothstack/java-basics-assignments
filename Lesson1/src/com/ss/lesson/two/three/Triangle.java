/**
 * 
 */
package com.ss.lesson.two.three;
import com.ss.lesson.two.three.display.TriangleBuilder;
/**
 * @author Space Prius
 *
 */
public class Triangle implements Shape {
	int[] x;
	int [] y;
	int height;
	/**
	 * 
	 */
	public Triangle(int[] xarray, int[] yarray, int h) {
		// TODO Auto-generated constructor stub
		x = xarray;
		y = yarray;
		height = h;
	}

	@Override
	public int calculateArea() {
		// This calculates the area of a triangle given its vertexes
		return (1/2)*Math.abs(x[0]*(y[1]-y[2])+x[1]*(y[2]-y[0])+x[2]*(y[0]-y[1]));
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		TriangleBuilder triangle = new TriangleBuilder();
		triangle.draw(x,y, 0,0, height);
		

	}

}
