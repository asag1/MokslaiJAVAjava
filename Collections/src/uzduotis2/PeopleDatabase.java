package uzduotis2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class PeopleDatabase {

    Map<String, String> zmoniuSarasas = new HashMap();

    public PeopleDatabase(Map<String, String> zmoniuSarasas) {
        this.zmoniuSarasas = zmoniuSarasas;
    }

    public Map<String, String> getZmoniuSarasas() {
        String []texts = {"Jonas", "Laura", "Saulius", "Rasa", "Julija"};

        int index = ThreadLocalRandom.current().nextInt(0, texts.length);

        return zmoniuSarasas;
    }
}
