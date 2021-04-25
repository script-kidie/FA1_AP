package waserete;

public class Wascheck {
    private Wasjes_draaier wasjes_draaier;
    private Wasje wasje;

    public Wascheck(Wasjes_draaier wasjes_draaier, Wasje wasje) throws Exception{
        if ( ! wasjes_draaier.getW_kleur().equals(wasje.getKleur())) {
            throw new Exception("Kan geen wasje draaien: De wasmiddel kleur en kleding kleur zijn niet hetzelfde");
        }
        // prints informatie over de was beurt en de wasjes draaier //
        System.out.println("\n/-- informatie Wasje --/ ");
        System.out.println("Wasmachine nummer: " + wasje.getNummer());
        System.out.println("Rotaties per minuut: " + wasje.getRpm());
        System.out.println("Was tempratuur: " + wasje.getTemp_c() + " Graden Celcius");
        System.out.println("Stof kleding: " + wasje.getStof());
        System.out.println("Kleur kleding: " + wasje.getKleur());
        System.out.println("Naam wasjes draaier: " + wasjes_draaier.getNaam());
        System.out.println("Aantal ml wasmiddel in bezit: " + wasjes_draaier.getInhoud_ml());

        this.wasjes_draaier = wasjes_draaier;
        this.wasje = wasje;
    }
    @Override
    public String toString() {
        return "Wascheck{" +
                "wasjes_draaier=" + wasjes_draaier +
                ", wasje=" + wasje +
                '}';
    }
}
