package skaiciuSeka;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SkaiciuSeka {

//    public static void main(String[] args) {
//        List<Integer> skaiciuSarasas = new ArrayList<>();
//        skaiciuSarasas.add(1);
//        skaiciuSarasas.add(2);
//        String naujasSkaiciuSarasas = konversija(skaiciuSarasas);
//        System.out.println(naujasSkaiciuSarasas);
//    }


    public static String konversija(List<Integer> skaiciuSarasas) {

        String stringSarasas = skaiciuSarasas.stream()
                .map(skaicius -> skaicius % 2 == 0 ? "e" + skaicius : "o" + skaicius)
                .collect(Collectors.joining(","));

//        String stringSarasas2 = skaiciuSarasas.stream()
//                .filter(skaiciai -> skaiciai % 2 != 0)
//                .map(skaiciai -> skaiciai.toString())
//                .map(skaiciai -> skaiciai.concat("e"))
//                .collect(Collectors.joining(","));


        return stringSarasas;
    }


}
