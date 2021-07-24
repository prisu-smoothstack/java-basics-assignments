package com.ss.lesson.three.three;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instantiate file reader
		try {
			//instantiate starting functions
			FileReader fr = new FileReader(args[0]);
			Character c = args[1].toCharArray()[0];
			int i;
			Integer count = 0;
			//Check to see if the character (as an integer) equals the character we are looking for.
			while((i=fr.read())!=-1)
				count = i==(int)c ? ++count : count;
			//Output results
			System.out.println("The letter " + args[1].toCharArray()[0] + "appears " + count + " times in this file.");
			fr.close();
		}
		catch (FileNotFoundException fnf) {
			fnf.printStackTrace();
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
