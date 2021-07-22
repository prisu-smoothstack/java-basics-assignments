package com.ss.lesson.two.three;
import com.ss.lesson.two.three.display.CircleBuilder;;
public class Circle implements Shape {
	int d = 0;
	public Circle(int diameter) {
		// TODO Auto-generated constructor stub
		d = diameter;
	}

	@Override
	public int calculateArea() {
		// TODO Auto-generated method stub
		return (int)Math.pow((d/2) * Math.PI, 2);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(this.calculateArea());
	}

}
