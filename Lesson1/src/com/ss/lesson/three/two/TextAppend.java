/**
 * 
 */
package com.ss.lesson.three.two;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Estringer
 *
 */
public class TextAppend {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This exists to append text to a file.
		try {
			// Instantiate input and output streams
			FileWriter in = new FileWriter(args[0], true);
			Scanner scanner = new Scanner(System.in);
			//Ask what would be written
			System.out.println("What would you like to write?");
			// Output text
			String append = scanner.next();
			in.append(append);
			in.close();
			scanner.close();
		}
		catch (FileNotFoundException fnf) {
			fnf.printStackTrace();
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		
	}

}
