/**
 * 
 */
package com.ss.lesson.four.three;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This class is just there to handle the data buffer between the producer and consumer.
 * @author Space Prius
 *
 */
public class DataBuffer {
	private Queue<Integer> processingBuffer = new LinkedList<>();
	private static boolean exit = false;
	private static volatile DataBuffer _instance;
	//Makes sure only one Databuffer can exist
	public static DataBuffer getInstance() {
		if(_instance == null) {
			synchronized(DataBuffer.class) {
				if(_instance == null) {
					_instance = new DataBuffer();
				}
			}
		}
		return _instance;
	}
	public synchronized void addData(Integer i) {
		processingBuffer.add(i);
	}
	/**
	 * Removes an integer from the queue for processing, unless it is empty, then it returns null.
	 * @return Integer or Null
	 */
	public synchronized Integer pollData() {
		return processingBuffer.poll();
	}
	/**
	 * @return the exit
	 */
	public static boolean isExit() {
		return exit;
	}
	/**
	 * @param exit the exit to set
	 */
	public static void setExit(boolean exit) {
		DataBuffer.exit = exit;
	}
	
}
