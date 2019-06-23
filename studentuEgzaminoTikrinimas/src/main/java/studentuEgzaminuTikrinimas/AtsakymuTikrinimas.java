package studentuEgzaminuTikrinimas;

public class AtsakymuTikrinimas {
    NuskaitymasIsJson isJson;
    private int vertinimas;

    public AtsakymuTikrinimas(int vertinimas) {
        this.vertinimas = vertinimas;
    }

    public AtsakymuTikrinimas() {
    }

    public AtsakymuTikrinimas(NuskaitymasIsJson isJson) {
        this.isJson = isJson;
    }

    public int getVertinimas() {
        return vertinimas;
    }

    public void setVertinimas(int vertinimas) {
        this.vertinimas = vertinimas;
    }

    protected int vertinimas() {
        vertinimas = 0;
        for (int i = 1; i <= isJson.getTeisinguAtsakymuSarasas().size(); i++) {
            if (isJson.getStudentoAtsakymuSarasas().containsKey(i) == isJson.getTeisinguAtsakymuSarasas().containsKey(i)) {
                try {
                    if (isJson.getStudentoAtsakymuSarasas().get(i).equals(isJson.getTeisinguAtsakymuSarasas().get(i))) {
                        vertinimas++;
                    }
                } catch (NullPointerException e) {
                }
            }
        }
        return vertinimas;
    }
}

