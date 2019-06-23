package unikaliosRaides;

import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UnikaliosRaides {

    public static String isrinktiUnikalesRaides(List<String> zodziuSarasas) {

        return zodziuSarasas.stream()
                .map(raide -> raide.split(""))
                .flatMap(array -> Arrays.stream(array))
                .distinct()
                .collect(Collectors.joining());


    }
}
