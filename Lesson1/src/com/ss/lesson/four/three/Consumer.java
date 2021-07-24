/**
 * 
 */
package com.ss.lesson.four.three;

/**
 * @author Space Prius
 *
 */
public class Consumer {
	private static DataBuffer buffer = DataBuffer.getInstance();
	/**
	 * @param args
	 */
	private static void loop() {
		Integer i;
		// TODO Auto-generated method stub
		//While the databuffer is not broadcasting exit
		while(!DataBuffer.isExit()) {
			i = buffer.pollData();
			if (i != null)
				//If it's null do nothing
				continue;
			else
				//Print the number
				System.out.println("Number: " + i);
		}
	}
	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() { loop(); }
		}).start();
	}

}
