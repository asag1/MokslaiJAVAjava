import org.junit.Test;
import geresnisZodis.GeresnisZodis;

import static org.junit.Assert.assertEquals;


public class GeresnisZodisTestas {


    @Test
    public void GeresnisZodisTestas_kuris(){

        boolean geresnis = GeresnisZodis.kurisGeresnisZodis("labas", "iki", (pirmasZodis, antrasZodis) -> pirmasZodis.length() < antrasZodis.length());
        assertEquals(false, geresnis);

    }
}
