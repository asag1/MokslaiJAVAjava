package studentuEgzaminuTikrinimas;

public class StudentoRezultatai {
    private Studentai studentai;
    private Egzaminas egzaminas;
    private int vertinimas;


    public StudentoRezultatai(Studentai studentai, Egzaminas egzaminas, int vertinimas) {
        this.studentai = studentai;
        this.egzaminas = egzaminas;
        this.vertinimas = vertinimas;
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

    public int getVertinimas() {
        return vertinimas;
    }

    public void setVertinimas(int vertinimas) {
        this.vertinimas = vertinimas;
    }
}
