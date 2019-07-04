/*
 * CharComposer
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package shamshur.z1.inputRevisor;

import java.util.Scanner;

public class CharComposer {

	//simple console input of char
	//!! returns UPPER CASED first char of inputed string
	public static char inputChar()
	{
        Scanner scan=new Scanner(System.in);
        return scan.nextLine().toUpperCase().toCharArray()[0];
	}
	
}
