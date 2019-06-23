package studentuEgzaminuTikrinimas;

import java.util.List;

public class Atsakymai {

    private Studentai studentai;
    private Egzaminas egzaminas;
    private List<Testas>atsakymai;

    public Atsakymai() {
    }

    public Atsakymai(Studentai studentai, Egzaminas egzaminas, List<Testas> atsakymai) {
        this.studentai = studentai;
        this.egzaminas = egzaminas;
        this.atsakymai = atsakymai;
    }

    public Studentai getStudentai() {
        return studentai;
    }

    public void setStudentai(Studentai studentai) {
        this.studentai = studentai;
    }

    public Egzaminas getEgzaminas() {
        return egzaminas;
    }

    public void setEgzaminas(Egzaminas egzaminas) {
        this.egzaminas = egzaminas;
    }

    public List<Testas> getAtsakymai() {
        return atsakymai;
    }

    public void setAtsakymai(List<Testas> atsakymai) {
        this.atsakymai = atsakymai;
    }

    @Override
    public String toString() {
        return "Atsakymai{" +
                "studentai=" + studentai +
                ", egzaminas=" + egzaminas +
                ", atsakymai=" + atsakymai +
                '}';
    }
}
