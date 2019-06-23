package Uzduotis;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Object> a = new ArrayList<Object>();
        a.add("a");
        a.add("b");
        a.add(null);
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("target/blablabla.json");
        mapper.writeValue(file, a);

//        Sender sender = new Sender("Jonas", 10, 500);
//        Receiver receiver = new Receiver("Karolis", 30, 741);
//        Payment payment = new Payment(sender, receiver);

//        ObjectMapper mapper = new ObjectMapper();
//        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

//        String jsonInString = mapper.writeValueAsString(payment);
//        System.out.println(jsonInString);
//        File file = new File("asmenys.json");
//        mapper.writeValue(file, payment);
//        mapper.writeValue(file, sender);
//        mapper.writeValue(file, receiver);


//        Payment asmuo = mapper.readValue(file, Payment.class);
//        System.out.println(asmuo);
//        String jsonEilute = "{\"vardas\":\"Jonas\",\"amzius\":10,\"payment\":500}";
//        Sender paymentEilutes = mapper.readValue(jsonEilute, Sender.class);
//        System.out.println(paymentEilutes.getAmzius());

//        String jsonEilute = "{\"sender\":{\"vardas\":\"Jonas\",\"amzius\":10,\"payment\":500},\"receiver\":{\"vardas\":\"Karolis\",\"amzius\":30,\"payment\":741}}";
//        Payment paymentEilutes = mapper.readValue(jsonEilute, Payment.class);
//        System.out.println(paymentEilutes.getReceiver().getAmzius());
    }
}
