/**
 * 
 */
package com.ss.lesson.two.three;
import com.ss.lesson.two.three.display.RectBuilder;
/**
 * @author Space Prius
 *
 */
public class Rectangle implements Shape {

	int w;
	int h;
	/**
	 * 
	 */
	public Rectangle(int width, int height) {
		// TODO Auto-generated constructor stub
		w = width;
		h = height;
	}

	@Override
	public int calculateArea() {
		// TODO Auto-generated method stub
		return w * h;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(this.calculateArea());
	}

}
