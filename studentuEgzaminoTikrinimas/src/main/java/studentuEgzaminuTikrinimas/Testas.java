package studentuEgzaminuTikrinimas;

public class Testas<K, V> {

    private K klausimoNr;
    private V pateiktasAtsakymas;

    public Testas() {
    }

    public Testas(K klausimoNr, V pateiktasAtsakymas) {
        this.klausimoNr = klausimoNr;
        this.pateiktasAtsakymas = pateiktasAtsakymas;
    }

    public K getKlausimoNr() {
        return klausimoNr;
    }

    public void setKlausimoNr(K klausimoNr) {
        this.klausimoNr = klausimoNr;
    }

    public V getPateiktasAtsakymas() {
        return pateiktasAtsakymas;
    }

    public void setPateiktasAtsakymas(V pateiktasAtsakymas) {
        this.pateiktasAtsakymas = pateiktasAtsakymas;
    }

    @Override
    public String toString() {
        return "Testas{" +
                "klausimoNr=" + klausimoNr +
                ", pateiktasAtsakymas='" + pateiktasAtsakymas + '\'' +
                '}';
    }
}
