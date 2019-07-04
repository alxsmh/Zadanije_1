/*
 * Task4
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package shamshur.z1.task4.controller;
import static shamshur.z1.task4.Progressions.NumberProgression.*;
import static shamshur.z1.inputRevisor.TypeConverter.makeStringFromInt;

public class Task4 {

	public static void main(String[] args) {
		// define number
		int number = 754210;
		
		//convert number to string
		String value = makeStringFromInt(number);
		
		//answer: is it progressive/regressive number?
		System.out.printf("Is that %i progresive or regresive? :",isProgressioned(value));

	}
	
}
