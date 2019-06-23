import org.junit.Test;
import skaiciuSeka.SkaiciuSeka;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SkaiciuSekosTestai {

    @Test
    public void SkaiciuSekosTestas_Nelyginis() {
        String skaiciuSeka = SkaiciuSeka.konversija(Arrays.asList(1,2));
        assertEquals("1e,2o", skaiciuSeka);
    }

}
