package waserete;

public class Wasmiddel{
    private int inhoud_ml;
    private String w_kleur;

    public Wasmiddel(String w_kleur, int inhoud_ml) {
        this.inhoud_ml = inhoud_ml;
        this.w_kleur = w_kleur;
    }

    public int getInhoud_ml() {
        return inhoud_ml;
    }

    public String getW_kleur() {
        return w_kleur;
    }

    @Override
    public String toString() {
        return "Wasmiddel{" +
                "inhoud_ml=" + inhoud_ml +
                ", w_kleur='" + w_kleur + '\'' +
                '}';
    }
}
