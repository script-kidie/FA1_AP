package waserete;

public interface Wasjes_draaier {
    /**
     * geeft de naam van de persoon die de was wilt draaien
     * @return de naan van de persoon
     */
    String getNaam();

    /**
     * geeft de kleur van het wasmiddel dat de persoon gebruikt om de was te draaien
     * @return de kleur van het wasmiddel
     */
    String getW_kleur();

    /**
     * geeft de hoeveelheid wasmiddel dat over is in mililiter
     * @return de hoeveelheid wasmiddel
     */
    int getInhoud_ml();
}
