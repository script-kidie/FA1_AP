package waserete;

public class Kleding {
    private String kleur;
    private String stof;

    public Kleding(String kleur, String stof) {
        this.kleur = kleur;
        this.stof = stof;
    }

    public String getKleur() {
        return kleur;
    }

    public String getStof() {
        return stof;
    }

    @Override
    public String toString() {
        return "Kleding{" +
                "kleur='" + kleur + '\'' +
                ", stof='" + stof + '\'' +
                '}';
    }
}
