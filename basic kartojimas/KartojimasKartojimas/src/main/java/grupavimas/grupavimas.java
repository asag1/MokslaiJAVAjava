package grupavimas;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class grupavimas {

    public static void grupavimasRaidziu(List<String> raides) throws IOException {

        Map<String, List<String>> groupedLetters = raides.stream()
                .collect(Collectors.groupingBy(raide -> raide));

        Path naujasSarasas = Files.createFile(Paths.get
                ("C:\\Users\\W10\\IdeaProjects\\KartojimasKartojimas\\src\\grupavimasRaidziu"));

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(naujasSarasas)) {
            groupedLetters.forEach((letter, repetitions) -> {
                try {
                    bufferedWriter.write(letter + ": " + repetitions.size());
                    bufferedWriter.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
