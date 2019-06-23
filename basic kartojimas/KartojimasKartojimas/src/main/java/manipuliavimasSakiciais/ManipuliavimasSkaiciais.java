package manipuliavimasSakiciais;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ManipuliavimasSkaiciais {

    public static String skaiciusKeitimas(String skaiciai) {


        return Arrays.stream(skaiciai.split(","))
                .mapToInt(Integer::parseInt)
                .map(skaicius -> (skaicius * 2))
                .filter(skaicius -> skaicius % 4 != 0)
                .mapToObj(skaicius -> String.valueOf(skaicius))
                .collect(Collectors.joining(":"));

    }
}
