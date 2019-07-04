/*
 * Task11
 * 
 * Version: 1.0
 * 
 * 04.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package shamshur.z1.task11.controller;
import static shamshur.z1.task11.calendar.Dater.calculateNextDate;
import static shamshur.z1.inputRevisor.OutputHelper.print;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print("Current test date: 28.02.2004");
		print("Next date: ");
		print(calculateNextDate(28, 02, 2004));
	}

}
