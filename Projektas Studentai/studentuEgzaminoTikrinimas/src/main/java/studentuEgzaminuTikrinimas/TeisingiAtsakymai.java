package studentuEgzaminuTikrinimas;

import java.util.List;

public class TeisingiAtsakymai {

    private List<Testas> teisingiAtsakymai;

    public TeisingiAtsakymai() {
    }

    public TeisingiAtsakymai(List<Testas> teisingiAtsakymai) {
        this.teisingiAtsakymai = teisingiAtsakymai;
    }

    public List<Testas> getTeisingiAtsakymai() {
        return teisingiAtsakymai;
    }

    public void setTeisingiAtsakymai(List<Testas> teisingiAtsakymai) {
        this.teisingiAtsakymai = teisingiAtsakymai;
    }

    @Override
    public String toString() {
        return "TeisingiAtsakymai{" +
                "teisingiAtsakymai=" + teisingiAtsakymai +
                '}';
    }
}