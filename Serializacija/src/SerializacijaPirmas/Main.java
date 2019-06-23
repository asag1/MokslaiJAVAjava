package SerializacijaPirmas;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Sender sender =  new Sender("Jonas", 10, 500);
        Receiver receiver = new Receiver("Karolis", 30, 741);

        Payment payment = new Payment(sender, receiver);

        FileOutputStream fops = new FileOutputStream("asmens_failas4.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fops);
//        objectOutputStream.writeObject(sender);
//        objectOutputStream.flush();
//        objectOutputStream.close();


        FileInputStream fips = new FileInputStream("asmens_failas4.txt");
        ObjectInputStream ops = new ObjectInputStream(fips);
        Sender sender2 = (Sender) ops.readObject();
        ops.close();

        System.out.println(sender2.getAmzius());
        System.out.println(sender2.getVardas());
    }
}
