import fizzBuzz.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {


    @Test
    public void fizzBuzzTest_arKonvetruoja() {
        String skaiciuSeka = FizzBuzz.konversijaString(15);
        assertEquals("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz", "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz");
    }
}
