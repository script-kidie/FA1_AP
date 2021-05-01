package waserete;

public class Wascheck {
    private WasjesDraaier wasjesDraaier;
    private Wasje wasje;

    public Wascheck(WasjesDraaier wasjesDraaier, Wasje wasje) {
        this.wasjesDraaier = wasjesDraaier;
        this.wasje = wasje;

        if ( ! wasje.getKleur().equals(wasjesDraaier.getWkleur() )) {
            System.out.println("\n!!-- informatie Wasje --!!");
            System.out.println("Kleur van de was en Kleur van het wasmiddel komen niet overeen");
            System.out.println("Was kan niet worden uitgevoerd");
        }

        else{
            System.out.println("\n//-- informatie Wasje --// ");
            System.out.println("Wasmachine nummer: " + wasje.getNummer());
            System.out.println("Rotaties per minuut: " + wasje.getRpm());
            System.out.println("Was tempratuur: " + wasje.getTempC() + " Graden Celcius");
            System.out.println("Stof kleding: " + wasje.getStof());
            System.out.println("Kleur kleding: " + wasje.getKleur());
            System.out.println("Naam wasjes draaier: " + wasjesDraaier.getNaam());
            System.out.println("Aantal ml wasmiddel in bezit: " + wasjesDraaier.getInhoudMl() +
                    "ml ,wasmiddel in bezit na wasbeurt --> " + (wasjesDraaier.getInhoudMl()- 50) + "ml");
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
