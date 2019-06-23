package geresnisZodis;

import java.util.function.BiPredicate;

public class GeresnisZodis {

    public static void main(String[] args) {

    }

    public static boolean kurisGeresnisZodis(String zodis1, String zodis2, BiPredicate<String, String> geresnis) {

        return geresnis.test(zodis1, zodis2);

    }
}
