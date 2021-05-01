package waserete;

public class Persoon extends Wasmiddel implements WasjesDraaier{
    private String naam;


    public Persoon(String wkleur, int inhoudMl, String naam) {
        super(wkleur, inhoudMl);
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
