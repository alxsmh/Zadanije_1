/*
 * Task7
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package shamshur.z1.task7.controller;
import static shamshur.z1.task7.placer.PlaceChanger.changeIntBetween;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test values
		int a = 16;
		int b = -25;
		
		//output test values
		System.out.printf("\nNumbers : %d,%d", a,b);
		//output result
		System.out.printf("\nChanged : %s",changeIntBetween(a, b));
	}

}
