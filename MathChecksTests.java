import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathChecksTests {

    MathChecks mathChecks;

    @Before
    public void setUp(){
        mathChecks = new MathChecks();
    }


    @Test
    public void isPrimeTest() {
        Boolean result = MathChecks.isPrime(157);
        assertEquals(result, true);
    }

    @Test
    public void isPalindromeTest() {
        Boolean result = MathChecks.isPalindrome(12221);
        assertEquals(result, true);
    }

}
