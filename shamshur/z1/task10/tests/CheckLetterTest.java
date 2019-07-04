/*
 * CheckLetterTest
 * 
 * Version: 1.0
 * 
 * 04.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */

package shamshur.z1.task10.tests;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import static shamshur.z1.task10.letters.LetterCheck.checkGlasSwitch;
import static shamshur.z1.task10.letters.LetterCheck.checkGlasString;
import static shamshur.z1.task10.letters.LetterCheck.checkGlasCharArr;
import static shamshur.z1.task10.letters.LetterCheck.checkGlasIfElse;
import static shamshur.z1.task10.letters.LetterCheck.checkGlasRegularExp;

public class CheckLetterTest {
	
	// checkGlasSwitch
	@Test
	public void checkGlasSwitch_UpperCaseVowel_expectedTRUE()
	{
		boolean expected = true;
		boolean actual = checkGlasSwitch('È');
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkGlasSwitch_UpperCaseNotVowel_expectedFALSE()
	{
		boolean expected = false;
		boolean actual = checkGlasSwitch('Ð');
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkGlasSwitch_LowerCaseVowel_expectedTRUE()
	{
		boolean expected = true;
		boolean actual = checkGlasSwitch('è');
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkGlasSwitch_LowerCaseNotVowel_expectedFALSE()
	{
		boolean expected = false;
		boolean actual = checkGlasSwitch('ì');
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkGlasSwitch_SpecialSymbol_expectedFALSE()
	{
		boolean expected = false;
		boolean actual = checkGlasSwitch('%');
		
		assertEquals(expected, actual);
	}
	
	// checkGlasString
	@Test
	public void checkGlasString_UpperCaseVowel_expectedTRUE()
	{
		boolean expected = true;
		boolean actual = checkGlasString('È');
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkGlasString_UpperCaseNotVowel_expectedFALSE()
	{
		boolean expected = false;
		boolean actual = checkGlasString('Ð');
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkGlasString_LowerCaseVowel_expectedTRUE()
	{
		boolean expected = true;
		boolean actual = checkGlasString('è');
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkGlasString_LowerCaseNotVowel_expectedFALSE()
	{
		boolean expected = false;
		boolean actual = checkGlasString('ì');
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkGlasString_SpecialSymbol_expectedFALSE()
	{
		boolean expected = false;
		boolean actual = checkGlasString('%');
		
		assertEquals(expected, actual);
	}
	
	// checkGlasCharArr
	@Test
	public void checkGlasCharArr_UpperCaseVowel_expectedTRUE()
	{
		boolean expected = true;
		boolean actual = checkGlasCharArr('È');
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkGlasCharArr_UpperCaseNotVowel_expectedFALSE()
	{
		boolean expected = false;
		boolean actual = checkGlasCharArr('Ð');
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkGlasCharArr_LowerCaseVowel_expectedTRUE()
	{
		boolean expected = true;
		boolean actual = checkGlasCharArr('è');
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkGlasCharArr_LowerCaseNotVowel_expectedFALSE()
	{
		boolean expected = false;
		boolean actual = checkGlasCharArr('ì');
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkGlasCharArr_SpecialSymbol_expectedFALSE()
	{
		boolean expected = false;
		boolean actual = checkGlasCharArr('%');
		
		assertEquals(expected, actual);
	}
	
	// checkGlasIfElse
	@Test
	public void checkGlasIfElse_UpperCaseVowel_expectedTRUE()
	{
		boolean expected = true;
		boolean actual = checkGlasIfElse('È');
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkGlasIfElse_UpperCaseNotVowel_expectedFALSE()
	{
		boolean expected = false;
		boolean actual = checkGlasIfElse('Ð');
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkGlasIfElse_LowerCaseVowel_expectedTRUE()
	{
		boolean expected = true;
		boolean actual = checkGlasIfElse('è');
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkGlasIfElse_LowerCaseNotVowel_expectedFALSE()
	{
		boolean expected = false;
		boolean actual = checkGlasIfElse('ì');
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkGlasIfElse_SpecialSymbol_expectedFALSE()
	{
		boolean expected = false;
		boolean actual = checkGlasIfElse('%');
		
		assertEquals(expected, actual);
	}
	
	// checkGlasRegularExp
	@Test
	public void checkGlasRegularExp_UpperCaseVowel_expectedTRUE()
	{
		boolean expected = true;
		boolean actual = checkGlasRegularExp('È');
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkGlasRegularExp_UpperCaseNotVowel_expectedFALSE()
	{
		boolean expected = false;
		boolean actual = checkGlasRegularExp('Ð');
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkGlasRegularExp_LowerCaseVowel_expectedTRUE()
	{
		boolean expected = true;
		boolean actual = checkGlasRegularExp('è');
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkGlasRegularExp_LowerCaseNotVowel_expectedFALSE()
	{
		boolean expected = false;
		boolean actual = checkGlasRegularExp('ì');
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkGlasRegularExp_SpecialSymbol_expectedFALSE()
	{
		boolean expected = false;
		boolean actual = checkGlasRegularExp('%');
		
		assertEquals(expected, actual);
	}

}
