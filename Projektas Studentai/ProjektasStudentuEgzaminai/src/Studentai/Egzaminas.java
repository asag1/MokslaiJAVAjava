package Studentai;

import java.util.List;

public class Egzaminas {


    private int egzaminoNr;
    private String pavadinimasEgzamino;
    private EgzaminoTipas testas = EgzaminoTipas.TESTAS;
    private List<Studentai> studentai;

    public Egzaminas(int egzaminoNr, String pavadinimasEgzamino, EgzaminoTipas testas, List<Studentai> studentai) {
        this.egzaminoNr = egzaminoNr;
        this.pavadinimasEgzamino = pavadinimasEgzamino;
        this.testas = testas;
        this.studentai = studentai;
    }

    public int getEgzaminoNr() {
        return egzaminoNr;
    }

    public String getPavadinimasEgzamino() {
        return pavadinimasEgzamino;
    }

    public EgzaminoTipas getTestas() {
        return EgzaminoTipas.TESTAS;
    }

    public List<Studentai> getStudentai() {
        return studentai;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
