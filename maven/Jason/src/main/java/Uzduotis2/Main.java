package Uzduotis2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Imone> sarasas = new ArrayList<Imone>();
        Faker faker = new Faker();

        for (int i = 0; i < 100; i++) {
            String pavadinimas = faker.company().name();
            long kodas = faker.number().randomNumber();
            int skaicius = faker.number().numberBetween(5, 250);
            long apyvarta = faker.number().numberBetween(100000, 1000000);
            sarasas.add(new Imone(pavadinimas, kodas, skaicius, apyvarta));
        }
        System.out.println(sarasas);
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("imones.json");
        mapper.writeValue(file, sarasas);
    }
}
