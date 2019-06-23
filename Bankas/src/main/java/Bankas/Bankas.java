package Bankas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bankas {

    Map<Asmuo, BankoSaskaita> saskaitos = new HashMap<Asmuo, BankoSaskaita>();


    public void sukurtiBankoSaskaita(Asmuo saskaitosValdytojas, Valiuta valiuta) {
        BankoSaskaita bankoSaskaita= new BankoSaskaita(0, valiuta, saskaitosValdytojas);
        saskaitos.put(saskaitosValdytojas, bankoSaskaita);
    }

    public double gautiAsmensSaskaitosLikuti(Asmuo saskaitosValdytojas) {

        return saskaitos.get(saskaitosValdytojas).getLikutis();
    }

    public void pervestiPinigus(Asmuo suntejas, Asmuo gavejas, double pinigai) {
    double a = saskaitos.get(suntejas).nuskaiciuoti(pinigai);
    double b = saskaitos.get(gavejas).ideti(pinigai);

    }

    public void inestiPiniguISaskaita(Asmuo saskaitosValdytojas) {

    }

    public void spausdintiSaskaituDuomenis() {

    }
}
