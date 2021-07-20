package com.ss.lesson.one;
/**
 * Class to handle the first assignment. Creates lines of asterisks
 * @author estringer
 *
 */
public class Assignment1 {
	//Just decided to separate the lines themselves from the main function
	public static String lineGen(int iterations) {
		String output = "";
		for (int i = 0; i < iterations; i++) {
			output = output + "*";
		};
		return output;
	};
	/**
	 * Generates a single line of an asterist tree
	 * @param iteration used for calculating the configuration of a line
	 * @param maxiter used for calculating the baseline from which lines are calculated
	 */
	public static String treeGen(int iteration, int maxiter) {
		String output = "";
		//Creates front end of the tree
		for (int i = 0; i < maxiter; i++) {
			if (i < (maxiter-iteration)) {
				output = output + " ";
			}
			else {
				output = output + "*";
			};
		};
		//Middle one is always there
		output = output + "*";
		//Backend of the tree
		for (int i = maxiter; i > 0; i--) {
			if (i <= (maxiter-iteration)) {
				output = output + " ";
			}
			else {
				output = output + "*";
			}
		};
		return output;
	};
	/**
	 * Creates a console array of lines given a certain number of iterations
	 * @param iterations int used 
	 */	
	public static void iterators(int iterations) {

		//Ascending Line
		for (int i = 0; i <= iterations; i++) {
			System.out.println(lineGen(i));
		};
		//Descending Line
		for (int i = iterations; i >= 0; i--) {
			System.out.println(lineGen(i));
		};
		//Ascending Tree
		for (int i = 0; i <= iterations; i++) {
			System.out.println(treeGen(i, iterations));
		}
		//Descending Tree
		for (int i = iterations; i >= 0; i--) {
			System.out.println(treeGen(i, iterations));
		}
	}
	public static void main(String[] args) {
		iterators(3);
	};
}
