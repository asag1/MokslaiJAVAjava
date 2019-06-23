import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import grupavimas.grupavimas;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GrupavimasTest {

    @Test
    public void grupavimasTest_kiekRaidziu() throws IOException {

        if(Files.exists(Paths.get("C:\\Users\\W10\\IdeaProjects\\KartojimasKartojimas\\src\\grupavimasRaidziu"))){
            Files.delete(Paths.get("C:\\Users\\W10\\IdeaProjects\\KartojimasKartojimas\\src\\grupavimasRaidziu"));
        }

        grupavimas.grupavimasRaidziu(Arrays.asList("a", "b", "b", "z", "b"));
        List<String> readAllLines = Files.readAllLines(Paths.get("C:\\Users\\W10\\IdeaProjects\\KartojimasKartojimas\\src\\grupavimasRaidziu"));
        assertEquals(3, readAllLines.size());

    }
}
