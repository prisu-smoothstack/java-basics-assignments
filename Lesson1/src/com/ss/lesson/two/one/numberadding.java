/**
 * 
 */
package com.ss.lesson.two.one;

/**
 * @author Space Prius
 *
 */
public class numberadding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int prev;
		int total = 0;
		int errors = 0;
		for (String str : args) {
			try {
				prev = Integer.parseInt(str);
			}
			catch (NullPointerException NPE) {
				prev = 0;
				errors++;
			}
			catch (NumberFormatException NFE) {
				prev = 0;
				errors++;
			}
			total += prev;
		}
		System.out.println("Your Sum:" + String.valueOf(total));
		if (errors > 0) {
			System.out.println("Don't think I didn't catch you trying any of that funny stuff, I caught " + String.valueOf(errors) + " Exceptions!");
		}
	}

}
