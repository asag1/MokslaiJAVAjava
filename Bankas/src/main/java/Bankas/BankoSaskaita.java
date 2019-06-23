package Bankas;

import org.apache.commons.lang3.RandomStringUtils;

public class BankoSaskaita {


    private double likutis;
    Valiuta valiuta;
    Asmuo saskaitosValdytojas;
    final private String saskaita;

    public BankoSaskaita(double likutis, Valiuta valiuta, Asmuo saskaitosValdytojas) {
        this.likutis = likutis;
        this.valiuta = valiuta;
        this.saskaitosValdytojas = saskaitosValdytojas;
        this.saskaita = "LT" + RandomStringUtils.randomNumeric(18);
    }

    public Valiuta getValiuta() {
        return valiuta;
    }

    public Asmuo getSaskaitosValdytojas() {
        return saskaitosValdytojas;
    }

    public String getSaskaita() {
        return saskaita;
    }

    public double getLikutis() {
        return likutis;
    }

    public void ideti(double pinigai) {
        likutis = this.likutis + pinigai;

    }

    public double nuskaiciuoti(double norimaNurasytiSuma) {

        if (this.likutis > norimaNurasytiSuma) {
            likutis = likutis - norimaNurasytiSuma;
            return norimaNurasytiSuma;
        }
        return 0;
    }


    @Override
    public String toString() {
        return saskaitosValdytojas +
                " BankoSaskaita " + saskaita +
                ", valiuta " + valiuta +
                " likutis " + likutis;
    }
}


