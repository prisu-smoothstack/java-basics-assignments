package com.ss.lesson.two.two;
import java.util.PriorityQueue;
public class arraychecking {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) { 
		//Array, threw one letter in there for exception handling
		int[][] map = { {5, 6}, {4, 12}, {25, 14}, {6, 3} };
	    int max = 0;
	    int pos1 = -1;
	    int pos2 = -1;
	    int[] maxpos = {0,0};
	    /*
	     * I decided against using a PriorityQueue for this because I thought it would go against the spirit of the assignment to use one.
	     * It would go against the spirit of the assignment in my opinion, since a priority queue automatically
	     * Sorts based off the highest value.
	     */
		for (int[] set : map) {
			//Checking if a number in a set is better than max
			pos1++;
			pos2 = -1;
			for (int n : set) {
				pos2++;
				if (n > max) {
					max = n;
					maxpos[0] = pos1;
					maxpos[1] = pos2;
				}
			}

		}
		System.out.println("Highest number: " + max);
		System.out.println("Located at position: [" + maxpos[0] + "] [" + maxpos[1] + "]");
	}
}
