package waserete;

public class Wasmiddel{
    private int inhoudMl;
    private String wkleur;

    public Wasmiddel(String wkleur, int inhoud_ml) {
        this.inhoudMl = inhoudMl;
        this.wkleur = wkleur;
    }

    public int getInhoudMl() {
        return inhoudMl;
    }

    public String getWkleur() {
        return wkleur;
    }

    @Override
    public String toString() {
        return "Wasmiddel{" +
                "inhoud_ml=" + inhoudMl +
                ", w_kleur='" + wkleur + '\'' +
                '}';
    }
}
