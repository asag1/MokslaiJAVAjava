package comparator.nrVienas;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestStudent {

    public static void main(String[] args) {

        JavaStudentGroup javaStudentGroup = new JavaStudentGroup();

        javaStudentGroup.getStudentai().add(new Student(123, "Jonas", "Jonaitis"));
        javaStudentGroup.getStudentai().add(new Student(321, "Petras", "Petraitis"));
        javaStudentGroup.getStudentai().add(new Student(147, "Ona", "Onute"));
        javaStudentGroup.getStudentai().add(new Student(741, "Lina", "Linute"));
        javaStudentGroup.getStudentai().add(new Student(987, "Laura", "Laurita"));
        javaStudentGroup.getStudentai().add(new Student(789, "Rima", "Rimante"));
        javaStudentGroup.getStudentai().add(new Student(963, "Paulius", "Paulauskas"));
        javaStudentGroup.getStudentai().add(new Student(369, "Marius", "Marijus"));
        javaStudentGroup.getStudentai().add(new Student(258, "Minde", "Mindaugas"));
        javaStudentGroup.getStudentai().add(new Student(852, "Monika", "Kazlauskas"));
        javaStudentGroup.getStudentai().add(new Student(951, "Jonas", "Kazlauskas"));
        javaStudentGroup.getStudentai().add(new Student(159, "Saulius", "Ziza"));
        javaStudentGroup.getStudentai().add(new Student(753, "Saliute", "Salomeja"));
        javaStudentGroup.getStudentai().add(new Student(357, "Inga", "Lysova"));
        javaStudentGroup.getStudentai().add(new Student(6985, "Birute", "Lauri"));
        javaStudentGroup.getStudentai().add(new Student(5236, "Marcius", "Galb"));
        javaStudentGroup.getStudentai().add(new Student(2541, "Val", "Galb"));
        javaStudentGroup.getStudentai().add(new Student(8745, "Ana", "Kazlauskas"));
        javaStudentGroup.getStudentai().add(new Student(8547, "Jolita", "Marciuk"));
        javaStudentGroup.getStudentai().add(new Student(2588, "Ignas", "Ciuk"));

//        Collections.sort(javaStudentGroup.getStudentai());
//        spausdink(javaStudentGroup.studentai, "surusiuota");
//
//        Collections.sort(javaStudentGroup.getStudentai(),new ComparatorSudentoNr());
//        spausdink(javaStudentGroup.studentai, "surusiuota Nr.");
//
//        javaStudentGroup.skaidymas(javaStudentGroup.studentai);

        javaStudentGroup.skirstymas(javaStudentGroup.studentai, 5);

    }

    public static void spausdink(List<Student> students, String zinute) {

        System.out.println(zinute);
        for (Student st : students) {
            System.out.println(st);
        }
    }

}
