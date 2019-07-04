/*
 * outputHelper
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */

package shamshur.z1.inputRevisor;

import java.math.BigDecimal;

//class is used for simplifying of standart console output
public class OutputHelper {
	
	// output to console depending on boolean result
	public static void outputConsoleBooleanResultText (String trueText, String falseText, boolean value)
	{
		if (value)
		{
			System.out.println(trueText);
		}
		else
		{
			System.out.println(falseText);
		}
	}
	
	// simple String output to console
	public static void print(String value)
	{
		System.out.println(value);
	}
	
	//simple float value output with formated text
	public static void print(String text,float arg)
	{
		System.out.printf(text,arg);
	}
	
	//simple double value output with formated text
		public static void print(String text,double arg)
		{
			System.out.printf(text,arg);
		}
	
	//simple BigDecimal output with formated text
	public static void print(String text,BigDecimal arg)
	{
		System.out.printf(text,arg);
	}
	
	//simple int value output with formated text
		public static void print(String text,int arg)
		{
			System.out.printf(text,arg);
		}

}
