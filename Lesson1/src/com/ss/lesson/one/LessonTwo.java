/**
 * 
 */
package com.ss.lesson.one;

/**
 * @author estringer
 *
 */
import java.util.Random;
import java.util.Scanner;
public class LessonTwo {
	/**
	 * Tutorializes the player on how to play the game
	 */
	static void tutorial() {
		System.out.println("Lets play a game for your soul...");
		System.out.println("Please guess a number from 1 to 100");
		System.out.println("You must guess within 10 of the target number");
		System.out.println("But be careful! You only have 5 chances!");
		System.out.println("");
		System.out.println("   ,    ,    /\\   /\\");
		System.out.println("  /( /\\ )\\  _\\ \\_/ /_");
		System.out.println("  |\\_||_/| < \\_   _/ >");
		System.out.println("  \\______/  \\|0   0|/");
		System.out.println("    _\\/_   _(_  ^  _)_");
		System.out.println("   ( () ) /`\\|V\"\"\"V|/`\\");
		System.out.println("     {}   \\  \\_____/  /");
		System.out.println("     ()   /\\   )=(   /\\");
		System.out.println("jgs  {}  /  \\_/\\=/\\_/  \\");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		boolean winner = false;
		boolean loser = false;
		int attempt = 0;
		int answer = rand.nextInt(100)+1;
		//Main game loop
		tutorial();
		while (!winner && !loser) {
			//If they haven't tried 5 times play the game.
			if (attempt < 5) {
				attempt++;
				int guess = scanner.nextInt();
				if (Math.abs(guess-answer) <= 10) {
					System.out.println("You've won! The correct answer was: " + String.valueOf(answer));
					winner = true;
				}
				else {
					System.out.println("Try again!");
				}
			}
			else {
				loser = true;
				System.out.println("Sorry, your soul is mine!");
			}
		}
		scanner.close();
	}

}
