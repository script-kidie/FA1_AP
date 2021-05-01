package waserete;

public interface Wasje {
    /**
     * geeft de kleur van de kleding
     * @return de kleur van de kleding
     */
    String getKleur();

    /**
     * geeft de stof soort van de kleding
     * @return de stof van de kleding
     */
    String getStof();

    /**
     * geeft het nummer van de wasmachine
     * @return het wasmachine nummer
     */
    int getNummer();

    /**
     * geeft het aantal toeren poeren per minuut van de wasmachine
     * @return geeft het rpm van de wasmachine
     */
    int getRpm();

    /**
     * geeft de tempratuur in celcius van de wasbeurt
     * @return de trempratuur van de wasbeurt
     */
    int getTempC();
}
