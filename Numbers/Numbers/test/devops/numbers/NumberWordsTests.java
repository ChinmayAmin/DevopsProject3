package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
	}
	
	@Test
	public void numberReturnsCorrectResponseForZero() {
	  Assert.assertEquals("Zero", numberWords.toWords(0));
	}
	
	@Test
	public void numberReturnsCorrectResponseForFive() {
	   Assert.assertEquals("Five", numberWords.toWords(5));
	}
	   
	@Test
	public void numberReturnsDoubleDigits() {
	  Assert.assertEquals("Twenty Four", numberWords.toWords(24));
	}
	
    @Test
    public void numberTestHundred() {
      Assert.assertEquals("One Hundred", numberWords.toWords(100));
    }
    
	@Test
	public void numberReturnsTripleDigits() {
	  Assert.assertEquals("Five Hundred Fourty Five", numberWords.toWords(545));
	}
	
    @Test
    public void numberReturnsTripleDigits123() {
      Assert.assertEquals("One Hundred Twenty Three", numberWords.toWords(123));
    }
    
	@Test
	public void EightHundredNinetyTwo() {
	  Assert.assertEquals("Eight Hundred Ninety Two", numberWords.toWords(892));
	}
	
	@Test
	public void numberReturnsLast3digitNumberCorrectly() {
	  Assert.assertEquals("Nine Hundred Ninety Nine", numberWords.toWords(999));
	}

    @Test
    public void numberOutofRangeError() {
      Assert.assertEquals("Invalid Number", numberWords.toWords(123123));
    }
}
