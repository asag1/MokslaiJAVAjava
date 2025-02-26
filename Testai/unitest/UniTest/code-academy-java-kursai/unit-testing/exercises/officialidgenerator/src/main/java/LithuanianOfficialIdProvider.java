import java.time.LocalDate;
import java.time.LocalDateTime;

public class LithuanianOfficialIdProvider implements OfficialIdProvider {

    String[] lytis = {"3", "4"};

    @Override
    public String generateOfficialId(Person person) {
        LocalDate data = person.getBirthDate();
        int metai = data.getYear();
        int menuo = data.getMonthValue();
        int diena = data.getDayOfMonth();
        String datosDalis = String.format("%1$02d%2$02d%3$02d", metai % 100, menuo, diena);
        String asmenskodas = lytis[person.getGender() == Gender.MALE ? 0 : 1] + datosDalis;
        String naujasasmenskodas = asmenskodas + Skaitliukas.n;
        naujasasmenskodas = pridetiPaskutiniSkaiciu(naujasasmenskodas);
        Skaitliukas.didintiVienetu();
        return naujasasmenskodas;

    }


    String pridetiPaskutiniSkaiciu(String kod) {
        int sk[] = new int[11];
        for (int a = 0; a < 10; a++) {
            int foo;
            try {
                foo = Integer.parseInt(kod.substring(a, a + 1));
                sk[a] = foo;
            } catch (NumberFormatException e) {
                System.out.println(" pasitaike ne skaitmenu");
                System.exit(-1);
            }

        }
        int s = sk[0] * 1 + sk[1] * 2 + sk[2] * 3 + sk[3] * 4 + sk[4] * 5 + sk[5] * 6 + sk[6] * 7 + sk[7] * 8 + sk[8] * 9 + sk[9] * 1;
        if (s % 11 != 10) return kod + (s % 11);
        else {
            s = sk[0] * 3 + sk[1] * 4 + sk[2] * 5 + sk[3] * 6 + sk[4] * 7 + sk[5] * 8 + sk[6] * 9 + sk[7] * 1 + sk[8] * 2 + sk[9] * 3;
            if (s % 11 == 10) return kod + "0";
            else return kod + (s % 11);
        }
    }


}
