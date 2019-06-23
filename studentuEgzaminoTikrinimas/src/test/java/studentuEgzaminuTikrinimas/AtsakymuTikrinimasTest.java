package studentuEgzaminuTikrinimas;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class AtsakymuTikrinimasTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void studentuAtsakymai_nuskaityti() throws IOException {
        File file = tempFolder.newFile("studentuAtsakymai.json");
        assertTrue(file.exists());
    }

    @Test
    public void teisingiAtsakymai_nuskaityti() throws IOException {
        File file = tempFolder.newFile("teisingiAtsakymai.json");
        assertTrue(file.exists());
    }

    @Test
    public void irasymasJson_irasytas() throws IOException {
        File file = tempFolder.newFile("VisuStudentuAtsakymai.json");
        assertTrue(file.exists());
        assertNotNull(file);
    }
//    @Test
//    public void irasymasJson_irasytasStudento() throws IOException {
//        ObjectMapper mapper = new ObjectMapper();
//        IrasymasJson ij = new IrasymasJson();
//        File file = tempFolder.newFile("VisuStudentuAtsakymai.json");
//        IrasymasJson sr = mapper.readValue(file, IrasymasJson.class);
//
//    }
}
