package comparator.nrVienas;

import java.util.ArrayList;
import java.util.List;

public class JavaStudentGroup {

    List<Student> studentai = new ArrayList<>();
    int grupesSk;

    public int getGrupesSk() {
        return grupesSk;
    }

    public void setGrupesSk(int grupesSk) {
        this.grupesSk = grupesSk;
    }

    public List<Student> getStudentai() {
        return studentai;
    }

    public void setStudentai(List<Student> studentai) {
        this.studentai = studentai;
    }


    public void skirstymas(List<Student> studentai, int grupiuSk) {
        int studentuSk = studentai.size();
        int grupesDydis = studentuSk / grupiuSk;
        int nelygiGrupe = studentuSk % grupiuSk;
        int netelpaGrupeje = studentuSk - (grupesDydis * grupiuSk);

        if (nelygiGrupe == 0) {
            for (int i = 0; i > grupiuSk; i++) {
                List<Student> studentaiGrupes = studentai.subList((i * grupesDydis), (((i + 1) * grupesDydis) - 1));
                for (Student st : studentaiGrupes) {
                    System.out.println("Grupe: " + studentaiGrupes);
                }
            }
        } else {
            for (int i = 0; i > grupiuSk; i++) {
                if (netelpaGrupeje > 0) {
                    for (int j = 0; j > netelpaGrupeje; i++) {
                        List<Student> studentaiGrupes = studentai.subList(((i * grupesDydis) + j), ((((i + 1) * grupesDydis) - 1) + j));
                        for (Student st : studentaiGrupes) {
                            System.out.println("Grupe: " + studentaiGrupes);
                        }
                    }
                }
            }
        }
    }

    public void skaidymas(List<Student> studentai) {
        System.out.println("Pirmas sarasas");
        List<Student> studentaiPirmas = studentai.subList(0, 6);
        for (Student st : studentaiPirmas) {
            System.out.println(st);
        }
        System.out.println("Antras sarasas");
        List<Student> studentaiAntras = studentai.subList(6, 12);
        for (Student st : studentaiAntras) {
            System.out.println(st);
        }
        System.out.println("Trecias sarasas");
        List<Student> studentaiTrecias = studentai.subList(12, 18);
        for (Student st : studentaiTrecias) {
            System.out.println(st);
        }
        System.out.println("Ketvirtas sarasas");
        List<Student> studentaiKetvirtas = studentai.subList(18, 20);
        for (Student st : studentaiKetvirtas) {
            System.out.println(st);
        }
    }
}


