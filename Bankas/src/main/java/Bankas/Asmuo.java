package Bankas;

import java.util.Random;

public class Asmuo {
    private static int skaitliukas;
    final private int id;
    private String vardas;
    private String pavarde;

    public Asmuo(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.id= skaitliukas++;
    }

    public int getId() {
        return id;
    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

}
