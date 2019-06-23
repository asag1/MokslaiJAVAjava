package Studentai;

import java.util.List;

public class Atsakymai {

    List<Character> atsakymai;
    List<Character> teisingiAtsakymai;

    public Atsakymai(List<Character> atsakymai, List<Character> teisingiAtsakymai) {
        this.atsakymai = atsakymai;
        this.teisingiAtsakymai = teisingiAtsakymai;
    }

    public List<Character> getAtsakymai() {
        return atsakymai;
    }

    public List<Character> getTeisingiAtsakymai() {
        return teisingiAtsakymai;
    }

    private void atsakymuTikrinimas(List<Character> atsakymai, List<Character> teisingiAtsakymai) {
    }
}
