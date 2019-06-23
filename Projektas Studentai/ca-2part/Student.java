package comparator.nrVienas;

public class Student implements Comparable<Student> {

    private int sudentoNr;
    private String vardas;
    private String pavarde;

    public Student(int sudentoNr, String vardas, String pavarde) {
        this.sudentoNr = sudentoNr;
        this.vardas = vardas;
        this.pavarde = pavarde;
    }

    public int getSudentoNr() {
        return sudentoNr;
    }

    public void setSudentoNr(int sudentoNr) {
        this.sudentoNr = sudentoNr;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    @Override
    public int compareTo(Student o) {
       int a = this.getPavarde().compareTo(o.getPavarde());
       if ( a != 0) {
           return a;
       }
        int b = this.getVardas().compareTo(o.getVardas());
        if (b != 0) {
            return b;
        }
        return this.getSudentoNr()-o.getSudentoNr();
    }

    @Override
    public String toString() {
        return "Studentas: "+pavarde+" "+vardas+" jo Nr. "+sudentoNr;
    }
}
