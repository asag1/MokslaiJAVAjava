package studentuEgzaminuTikrinimas;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        NuskaitymasIsJson a = new NuskaitymasIsJson();
        AtsakymuTikrinimas b = new AtsakymuTikrinimas(a);
        IrasymasJson c = new IrasymasJson();

    }
}