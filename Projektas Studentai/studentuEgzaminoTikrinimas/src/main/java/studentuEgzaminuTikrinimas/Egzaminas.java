package studentuEgzaminuTikrinimas;


public class Egzaminas {

    private int egzaminoNr;
    private String pavadinimasEgzamino;
    private EgzaminoTipas testas;


    public Egzaminas() {
    }

    public Egzaminas(int egzaminoNr, String pavadinimasEgzamino, EgzaminoTipas testas) {
        this.egzaminoNr = egzaminoNr;
        this.pavadinimasEgzamino = pavadinimasEgzamino;
        this.testas = testas;

    }

    public int getEgzaminoNr() {
        return egzaminoNr;
    }

    public String getPavadinimasEgzamino() {
        return pavadinimasEgzamino;
    }

    public EgzaminoTipas getTestas() {
        return testas;
    }

    public void setEgzaminoNr(int egzaminoNr) {
        this.egzaminoNr = egzaminoNr;
    }

    public void setPavadinimasEgzamino(String pavadinimasEgzamino) {
        this.pavadinimasEgzamino = pavadinimasEgzamino;
    }

    public void setTestas(EgzaminoTipas testas) {
        this.testas = testas;
    }

    @Override
    public String toString() {
        return "Egzaminas{" +
                "egzaminoNr=" + egzaminoNr +
                ", pavadinimasEgzamino='" + pavadinimasEgzamino + '\'' +
                ", testas=" + testas +
                '}';
    }
}
