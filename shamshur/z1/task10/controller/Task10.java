/*
 * Task10
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package shamshur.z1.task10.controller;

import static shamshur.z1.task10.letters.LetterCheck.checkGlasSwitch;
import static shamshur.z1.task10.letters.LetterCheck.checkGlasString;
import static shamshur.z1.task10.letters.LetterCheck.checkGlasCharArr;
import static shamshur.z1.task10.letters.LetterCheck.checkGlasIfElse;
import static shamshur.z1.task10.letters.LetterCheck.checkGlasRegularExp;
//import static shamshur.z1.inputRevisor.CharComposer.inputChar;
import static shamshur.z1.inputRevisor.OutputHelper.outputConsoleBooleanResultText;
import static shamshur.z1.inputRevisor.OutputHelper.print;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sucsess = "GLAS";
		String failed = "NOT GLAS";
		
		//to perform keyboard input:
		//1. uncomment import static shamshur.z1.inputRevisor.CharComposer.inputChar;
		//2. inputChar() - paste instead of symbols in checkGlasXXX params
		
		//call checks
		print("Switch Checker. Input Char:");
		outputConsoleBooleanResultText(sucsess,failed,checkGlasSwitch('À'));
		
		print("String Checker. Input Char:");
		outputConsoleBooleanResultText(sucsess,failed,checkGlasString('Ö'));
		
		print("CharArr Checker. Input Char:");
		outputConsoleBooleanResultText(sucsess,failed,checkGlasCharArr('Å'));
		
		print("IfElse Checker. Input Char:");
		outputConsoleBooleanResultText(sucsess,failed,checkGlasIfElse('Ê'));
		
		print("RegularExp Checker. Input Char:");
		outputConsoleBooleanResultText(sucsess,failed,checkGlasRegularExp('Ó'));

	}

}
