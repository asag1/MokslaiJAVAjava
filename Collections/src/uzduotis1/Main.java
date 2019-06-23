package uzduotis1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Payment> paymentsSarasas = Payment.getPaymentIdRandum(10);

        for (Payment payment: paymentsSarasas){
            System.out.println(payment);
        }
    }

}
