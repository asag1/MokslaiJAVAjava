package SerializacijaPirmas;

import java.io.Serializable;

public class Asmuo implements Serializable {
    protected String vardas;
    protected transient int amzius;
    protected int payment;
    private static final long serialVersionUID = 123654L;

    public Asmuo(String vardas, int amzius, int payment) {
        this.vardas = vardas;
        this.amzius = amzius;
        this.payment = payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public int getPayment() {
        return payment;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public int getAmzius() {
        return amzius;
    }

    public void setAmzius(int amzius) {
        this.amzius = amzius;
    }
}
