/*
 * Task3
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package shamshur.z1.task3.controller;
import static shamshur.z1.task3.geometry.CircleSquarer.calculateRingSquare;
import static shamshur.z1.inputRevisor.OutputHelper.print;

public class Task3 {

	public static void main(String[] args) {

		//defining two rings
		double circle1R = 1.268d;
		double circle2R = 0.2d;
		
		//output of Ring square from 
		print("Ring Square : %.3f",calculateRingSquare(circle1R, circle2R));

	}

}
