/*
 * Task1
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */

package shamshur.z1.task1.controller;
import static shamshur.z1.task1.equalNumbers.EqualNumbers.isEqualNumbers;
import  static shamshur.z1.inputRevisor.OutputHelper.outputConsoleBooleanResultText;;

public class Task1 {

	public static void main(String[] args) {
		
		String trueText = "Numbers are equal!";
		String falseText = "Numbers aren't equal!";
		
		int iA = 6;
		int iB = 8;
		int iC = 1;
		
		float fA = 0.287f;
		float fB = 0.287f;
		float fC = 0.287f;
		
		//calculating equality state (int)
		boolean answer = (isEqualNumbers(iA,iB) && isEqualNumbers(iA,iC)) ? true:false;
		
		//question output 
		System.out.printf("Are Numbers: %d, %d and %d - equal? ", iA,iB,iC);
		
		//output result	
		outputConsoleBooleanResultText(trueText,falseText,answer);
		
		//calculating equality state (float)
		answer = (isEqualNumbers(fA,fB) && isEqualNumbers(fA,fC)) ? true:false;
		
		//question output 
		System.out.printf("Are Numbers: %f, %f and %f - equal? ", fA,fB,fC);
		
		//output result	
		outputConsoleBooleanResultText(trueText,falseText,answer);

	}

}
