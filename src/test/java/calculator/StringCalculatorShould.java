package calculator;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
class StringCalculatorShould {
	
	private StringCalculator stringCalculator;
	
	@BeforeTest
	public void init() {
		stringCalculator = new StringCalculator();
	}

   //test-for empty string
   public void empty_string_should_return_0() throws Exception {
        assertEquals(stringCalculator.add(""),0);   
    }
    // test for single number
   public void string_with_single_number_should_return_number_as_int() throws Exception {
       assertEquals(stringCalculator.add("2"),2);
   }
      // test for delimiter method
   public void twoNumbersCommaDelimitedReturnSum()throws Exception {
   	assertEquals(stringCalculator.add("1,2"),3);
   }
    // test for newline delimiter
   public void twoNumbersNewLineDelimitedReturnSum()throws Exception {
	   	assertEquals(stringCalculator.add("1\n2"),3);
	   }
   // test for multiple delimiter in three number
   public void threeNumbersDelimitedBothWayReturnSum() throws Exception{
	   	assertEquals(stringCalculator.add("1,2,3"),6);
	   }
   // test for multiple delimiter
   public void multipleDelimiterReturnSum() throws Exception {
	   	assertEquals(stringCalculator.add("1;2"),3);
	   }
  // test for  exception thrown by negative input
   @Test(expectedExceptions=Exception.class )
   public void  negativeInputReturnsException() throws Exception {
   	stringCalculator.add("-1");
   }
   // test for more than 1000 number ignore
   public void ignoreNumbersGreaterThan1000() throws Exception {
	   	assertEquals(stringCalculator.add("10,10,1001"),20);
	   }
}