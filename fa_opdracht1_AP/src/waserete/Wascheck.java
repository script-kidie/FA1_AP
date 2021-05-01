package waserete;

public class Wascheck {
    private WasjesDraaier wasjesDraaier;
    private Wasje wasje;

    public Wascheck(WasjesDraaier wasjesDraaier, Wasje wasje) {
        this.wasjesDraaier = wasjesDraaier;
        this.wasje = wasje;

        if ( ! wasje.getKleur().equals(wasjesDraaier.getWkleur())) {

            System.out.println("Kleur van de was en Kleur van het wasmiddel komen niet overeen");
        }

        else{
            System.out.println("hey");
        }
    }





    @Override
    public String toString() {
        return "Wascheck{" +
                "wasjes_draaier=" + wasjesDraaier +
                ", wasje=" + wasje +
                '}';
    }
}
