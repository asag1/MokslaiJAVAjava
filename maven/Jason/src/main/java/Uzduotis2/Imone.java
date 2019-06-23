package Uzduotis2;

public class Imone {

    private String imonesPavadinismas;
    private long imonesKodas;
    private int darbuotojuSk;
    private long apyvarata;

    public Imone() {
    }

    public Imone(String imonesPavadinismas, long imonesKodas, int darbuotojuSk, long apyvarata) {
        this.imonesPavadinismas = imonesPavadinismas;
        this.imonesKodas = imonesKodas;
        this.darbuotojuSk = darbuotojuSk;
        this.apyvarata = apyvarata;
    }

    public String getImonesPavadinismas() {
        return imonesPavadinismas;
    }

    public void setImonesPavadinismas(String imonesPavadinismas) {
        this.imonesPavadinismas = imonesPavadinismas;
    }

    public long getImonesKodas() {
        return imonesKodas;
    }

    public void setImonesKodas(int imonesKodas) {
        this.imonesKodas = imonesKodas;
    }

    public int getDarbuotojuSk() {
        return darbuotojuSk;
    }

    public void setDarbuotojuSk(int darbuotojuSk) {
        this.darbuotojuSk = darbuotojuSk;
    }

    public long getApyvarata() {
        return apyvarata;
    }

    public void setApyvarata(int apyvarata) {
        this.apyvarata = apyvarata;
    }

    @Override
    public String toString() {
        return "Imone{" +
                "imonesPavadinismas='" + imonesPavadinismas + '\'' +
                ", imonesKodas=" + imonesKodas +
                ", darbuotojuSk=" + darbuotojuSk +
                ", apyvarata=" + apyvarata +
                '}';
    }
}
