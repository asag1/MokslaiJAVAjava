import org.junit.Test;
import unikaliosRaides.UnikaliosRaides;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class UnikaliosRaidesTest {

    @Test
    public void UnikaliosRaidesTest_PalitiTikUnikales() {

        String unikalisoRaides = UnikaliosRaides.isrinktiUnikalesRaides(Arrays.asList("labas","iki"));
        assertEquals("labsik", unikalisoRaides);
    }
}
