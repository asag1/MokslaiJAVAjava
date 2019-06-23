package SerializacijaPirmas;

import java.io.*;

public class Payment {


        Sender sender;
        Receiver receiver;

    public Payment(Sender sender, Receiver receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }
}
