import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DataUzdavinysVienas {

    public static void main(String[] args) {


        LocalDateTime dataNow = LocalDateTime.now();
        LocalDateTime dataG = LocalDateTime.of(1982, 10, 04, 22, 00);
        System.out.println(ChronoUnit.MONTHS.between(dataG, dataNow));
        System.out.println(ChronoUnit.DAYS.between(dataG, dataNow));
        System.out.println(ChronoUnit.HOURS.between(dataG, dataNow));

        for (int i = 0; i < ChronoUnit.YEARS.between(dataG, dataNow); i++) {
            System.out.println(dataG.plusYears(i).getDayOfWeek());
        }


    }
}
