/*
 * Task9
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package shamshur.z1.task9.controller;
import static shamshur.z1.task9.dragon.DragonManager.calculateHeads;
import static shamshur.z1.task9.dragon.DragonManager.calculateEyes;
import static shamshur.z1.inputRevisor.OutputHelper.print;

public class Task9 {

	public static void main(String[] args) {
		
		//check if its a triangle, and if it is - check on rectangularity
		
		//output heads and eyes of dragon aged as 2731 years old
		print("\nHeads : %d",calculateHeads(2731));
		print("\nEyes : %d",calculateEyes(2731));
		

	}

}
