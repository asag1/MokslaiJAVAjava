package uzduotis1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class Payment {

    private long paymentId;
    private String text;
    private String recipientId;
    private String payerId;


    public Payment(long id, String text, String recipientId, String payerId) {
        this.paymentId = paymentId;
        this.text = text;
        this.recipientId = recipientId;
        this.payerId = payerId;
    }

    public static List<Payment> getPaymentIdRandum(int number) {
        String []texts = {"Mokejimas", "Payment", "Skola", "Mokesciai", "Pasalpa"};
        List<Payment> payments = new ArrayList<>(number);

        for (int i=0; i<number; i++) {

            long paymentId = System.currentTimeMillis() + ThreadLocalRandom.current().nextInt();
            int index = ThreadLocalRandom.current().nextInt(0, texts.length);
            String text = texts[index];
            String recipientId = UUID.randomUUID().toString();
            String payerId = UUID.randomUUID().toString();
            payments.add(new Payment(paymentId, text, recipientId, payerId));
        }
        return payments;
    }

    public String getText() {
        return text;
    }

    public String getRecipientId() {
        return recipientId;
    }

    public String getPayerId() {
        return payerId;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", text='" + text + '\'' +
                ", recipientId=" + recipientId +
                ", payerId=" + payerId +
                '}';
    }
}
