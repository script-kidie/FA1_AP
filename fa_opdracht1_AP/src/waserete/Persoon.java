package waserete;

public class Persoon extends Wasmiddel implements Wasjes_draaier{
    private String naam;


    public Persoon(String w_kleur, int inhoud_ml, String naam) {
        super(w_kleur, inhoud_ml);
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }


    @Override
    public String toString() {
        return "Persoon{" +
                "naam='" + naam + '\'' +
                '}';
    }
}
