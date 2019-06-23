package studentuEgzaminuTikrinimas;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        NuskaitymasIsJson a = new NuskaitymasIsJson();
        System.out.println(a.readFromJsonFileTeisingiAtsakymai());
        System.out.println(a.readFromJsonFileStudentuAtsakymai());
        System.out.println(a.irasymas().getStudentai());
        System.out.println(a.irasymas().getEgzaminas());
        System.out.println(a.irasymas().getVertinimas());
    }
}