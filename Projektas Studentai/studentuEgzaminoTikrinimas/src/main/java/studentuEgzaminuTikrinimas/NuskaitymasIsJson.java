package studentuEgzaminuTikrinimas;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NuskaitymasIsJson {
    @JsonProperty("Studentai")
    private Studentai studentai;
    @JsonProperty("Egzaminas")
    private Egzaminas egzaminas;
    @JsonProperty("Atsakymai")
    protected List<Testas> atsakymai;
    @JsonProperty("TeisingiAtsakymai")
    private List<Testas> teisingiAtsakymai;
    ObjectMapper mapper = new ObjectMapper();
    protected Map<Object, Object> teisinguAtsakymuSarasas = new HashMap<>();
    protected Map<Object, Object> studentoAtsakymuSarasas = new HashMap<>();
    StudentoRezultatai studentas;
    private int vertinimas;

    public NuskaitymasIsJson() {
    }

    public NuskaitymasIsJson(Map<Object, Object> teisinguAtsakymuSarasas, Map<Object, Object> studentoAtsakymuSarasas) {
        this.teisinguAtsakymuSarasas = teisinguAtsakymuSarasas;
        this.studentoAtsakymuSarasas = studentoAtsakymuSarasas;
    }

    public Studentai getStudentai() {
        return studentai;
    }

    public void setStudentai(Studentai studentai) {
        this.studentai = studentai;
    }

    public Egzaminas getEgzaminas() {
        return egzaminas;
    }

    public void setEgzaminas(Egzaminas egzaminas) {
        this.egzaminas = egzaminas;
    }

    public List<Testas> getAtsakymai() {
        return atsakymai;
    }

    public void setAtsakymai(List<Testas> atsakymai) {
        this.atsakymai = atsakymai;
    }

    public List<Testas> getTeisingiAtsakymai() {
        return teisingiAtsakymai;
    }

    public void setTeisingiAtsakymai(List<Testas> teisingiAtsakymai) {
        this.teisingiAtsakymai = teisingiAtsakymai;
    }

    public Map<Object, Object> getTeisinguAtsakymuSarasas() {
        return teisinguAtsakymuSarasas;
    }

    public void setTeisinguAtsakymuSarasas(Map<Object, Object> teisinguAtsakymuSarasas) {
        this.teisinguAtsakymuSarasas = teisinguAtsakymuSarasas;
    }

    public Map<Object, Object> getStudentoAtsakymuSarasas() {
        return studentoAtsakymuSarasas;
    }

    public void setStudentoAtsakymuSarasas(Map<Object, Object> studentoAtsakymuSarasas) {
        this.studentoAtsakymuSarasas = studentoAtsakymuSarasas;
    }

    public StudentoRezultatai getStudentas() {
        return studentas;
    }

    public void setStudentas(StudentoRezultatai studentas) {
        this.studentas = studentas;
    }

    public int getVertinimas() {
        return vertinimas;
    }

    public void setVertinimas(int vertinimas) {
        this.vertinimas = vertinimas;
    }

    protected Map<Object, Object> readFromJsonFileStudentuAtsakymai() throws IOException {
        File file = new File("C:\\Users\\W10\\IdeaProjects\\studentuEgzaminoTikrinimas\\studentuAtsakymai");
        NuskaitymasIsJson studentoAtsakymai = mapper.readValue(file, NuskaitymasIsJson.class);
        this.studentai = studentoAtsakymai.getStudentai();
        this.egzaminas = studentoAtsakymai.getEgzaminas();
        this.atsakymai = studentoAtsakymai.getAtsakymai();
        for (int i = 0; i < atsakymai.size(); i++) {
            studentoAtsakymuSarasas.put(atsakymai.get(i).getKlausimoNr(), atsakymai.get(i).getPateiktasAtsakymas());
        }
        return studentoAtsakymuSarasas;
    }

    protected Map<Object, Object> readFromJsonFileTeisingiAtsakymai() throws IOException {
        File file = new File("C:\\Users\\W10\\IdeaProjects\\studentuEgzaminoTikrinimas\\teisingiAtsakymai");
        NuskaitymasIsJson teisinguAt = mapper.readValue(file, NuskaitymasIsJson.class);
        this.teisingiAtsakymai = teisinguAt.getTeisingiAtsakymai();
        for (int i = 0; i < teisingiAtsakymai.size(); i++) {
            teisinguAtsakymuSarasas.put(teisingiAtsakymai.get(i).getKlausimoNr(), teisingiAtsakymai.get(i).getPateiktasAtsakymas());
        }
        return teisinguAtsakymuSarasas;
    }

    protected StudentoRezultatai irasymas() throws IOException {
        if (Files.exists(Paths.get("VisuStudentuAtsakymai.json"))) {
            Files.delete(Paths.get("VisuStudentuAtsakymai.json"));
        }
        studentas = new StudentoRezultatai(studentai, egzaminas, vertinimas());
        File file1 = new File("VisuStudentuAtsakymai.json");
        mapper.writeValue(file1, studentas);
        return studentas;
    }

    protected int vertinimas() {
        for (int i = 1; i <= getTeisinguAtsakymuSarasas().size(); i++) {
            if (getStudentoAtsakymuSarasas().containsKey(i) == getTeisinguAtsakymuSarasas().containsKey(i)) {
                try {
                    if (getStudentoAtsakymuSarasas().get(i).equals(getTeisinguAtsakymuSarasas().get(i))) {
                        vertinimas++;
                    }
                } catch (NullPointerException e) {
                }
            }
        }
        return vertinimas;
    }
}
