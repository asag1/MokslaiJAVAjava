import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DataUzdavinysDu {

    public static void main(String[] args) {


        LocalDate mdata = LocalDate.of(1960, 06, 10);
        LocalDate mdata2 = LocalDate.of(1980, 06, 10);;
        int dienuSk = (int) ChronoUnit.DAYS.between(mdata, mdata2);

        for (int i = 0; i < dienuSk; i++) {
            mdata = mdata.plusDays(i);
            int month = mdata.getMonthValue();
            int day = mdata.getDayOfMonth();
            String mdataFormt = mdata.format(DateTimeFormatter.ofPattern("YY/MM/dd"));
            int year = Integer.parseInt(mdataFormt.substring(0, 2));
            int data = month * day;
            if (data == year) {
                System.out.println(year + "/" + month + "/" + day);
            }
        }
    }
}
