/*
 * LetterCheck
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package shamshur.z1.task10.letters;

//checking if inputed UPPECASE char is vowel in Russian alphabet
public class LetterCheck {

	//return true if char a = any of [�Ũ�������]
	public static boolean checkGlasSwitch(char a)
	{
		//make inputed char valid(code compares only Upper case letters), just in case
		a = charToUpperCase(a);
		
		switch (a)
		{
		case '�':
		case '�':
		case '�':
		case '�':
		case '�':
		case '�':
		case '�':
		case '�':
		case '�':
		case '�':
			return true;
		default: 
			return false; 
		}
	}
	
	//return true if char a = any of [�Ũ�������]
	public static boolean checkGlasString(char a)
	{
		a = charToUpperCase(a);
		
		String asis = "�Ũ�������";
		
		if (asis.contains(String.valueOf(a)))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//return true if char a = any of [�Ũ�������]
	public static boolean checkGlasCharArr(char a)
	{
		//make inputed char valid(code compares only Upper case letters), just in case
		a = charToUpperCase(a);
		
		char[] chrArr = {'�','�','�','�','�','�','�','�','�','�'};
		
		//for each char in chrArr, compare a
		for (char c : chrArr) 
		{
			if (a == c)
			{
				return true;
			}
		}
		
		return false;
	}
	
	//return true if char a = any of [�Ũ�������]
	public static boolean checkGlasIfElse(char a)
	{
		//make inputed char valid(code compares only Upper case letters), just in case
		a = charToUpperCase(a);
		
		if (a == 'A')
		{
			return true;
		}
		else if (a == '�')
		{
			return true;
		}
		else if (a == '�')
		{
			return true;
		}
		else if (a == '�')
		{
			return true;
		}
		else if (a == '�')
		{
			return true;
		}
		else if (a == '�')
		{
			return true;
		}
		else if (a == '�')
		{
			return true;
		}
		else if (a == '�')
		{
			return true;
		}
		else if (a == '�')
		{
			return true;
		}
		else if (a == '�')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//regular expresion: if string has unicode case insensitive [���������] - return true
	public static boolean checkGlasRegularExp(char a)
	{		
		//convert char to string, because regExp works on string type
		return String.valueOf(a).matches("^(?ui:[���������]).*");
	}
	
	//converts input char to Upper Case one
	static char charToUpperCase(char a)
	{	
		return String.valueOf(a).toUpperCase().toCharArray()[0];
	}
}
