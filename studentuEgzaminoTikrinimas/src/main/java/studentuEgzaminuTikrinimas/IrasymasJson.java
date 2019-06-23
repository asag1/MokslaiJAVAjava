package studentuEgzaminuTikrinimas;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class IrasymasJson {
    ObjectMapper mapper = new ObjectMapper();
    NuskaitymasIsJson ns = new NuskaitymasIsJson();
    List<StudentoRezultatai> studentuRezultatai = new ArrayList<>();

    public IrasymasJson() {
    }

    public IrasymasJson(List<StudentoRezultatai> studentuRezultatai) {
        this.studentuRezultatai = studentuRezultatai;
    }

    public List<StudentoRezultatai> getStudentuRezultatai() {
        return studentuRezultatai;
    }

    public void setStudentuRezultatai(List<StudentoRezultatai> studentuRezultatai) {
        this.studentuRezultatai = studentuRezultatai;
    }

    private void studentuRezultatai() throws IOException {
        if (Files.exists(Paths.get("VisuStudentuAtsakymai.json"))) {
            Files.delete(Paths.get("VisuStudentuAtsakymai.json"));
        }
        File file = new File("C:\\Users\\W10\\IdeaProjects\\studentuEgzaminoTikrinimas\\VisuStudentuAtsakymai.json");
        studentuRezultatai.add(ns.getStudentas());
        mapper.writeValue(file, studentuRezultatai);
    }
}