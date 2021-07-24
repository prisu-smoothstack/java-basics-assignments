/**
 * 
 */
package com.ss.lesson.four.three;

import java.util.Scanner;

/**
 * @author Space Prius
 *
 */
public class Producer {
	private static DataBuffer buffer = DataBuffer.getInstance();
	/**
	 * @param args
	 */
	private static void loop() {
		//Scanner for input
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		while (!exit) {
			// Read line then try to add it to the buffer
			String input = scanner.nextLine();
			try {
				Integer i = Integer.parseInt(input);
				buffer.addData(i);
				
			}
			catch (NumberFormatException nfe) {
				// see if its exit
				if (input.equals("exit") || input.equals("Exit"))
					exit = true;
					DataBuffer.setExit(true);
			}
		}
		scanner.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			public void run() { loop(); }
		}).start();
	}

}
