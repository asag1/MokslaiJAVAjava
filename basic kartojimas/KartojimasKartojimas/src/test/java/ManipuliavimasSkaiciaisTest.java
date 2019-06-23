import manipuliavimasSakiciais.ManipuliavimasSkaiciais;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManipuliavimasSkaiciaisTest {

    @Test
    public void ManipuliavimasSkaiciaisTest_tikrinimasSkaiciavimo(){
        String skaiciai = ManipuliavimasSkaiciais.skaiciusKeitimas("1,2,3");
        assertEquals("2:6", skaiciai);
    }
}
