/*
 * Task2
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */

package shamshur.z1.task2.controller;
import static shamshur.z1.task2.metric.Metrical.*;

import java.math.BigDecimal;

import static shamshur.z1.inputRevisor.OutputHelper.print;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//dinosaur mass in kilograms
		int dinoMass = 799999960;
		
		//have to create BigDecimal, because surprises in answers may occur
		BigDecimal dm = new BigDecimal(dinoMass);
		
		print("-Dinosauric Mass-");
		print("\nTons   : %.3f",calculateTonsFromKilograms(dm));		//tons
		print("\nKilos  : %.3f",dm);									//killos
		print("\nGrams  : %.3f",calculateGramsFromKilograms(dm));		//grams
		print("\nMGrams : %.3f",calculateMiliGramsFromKilograms(dm));	//miligrams

	}

}
