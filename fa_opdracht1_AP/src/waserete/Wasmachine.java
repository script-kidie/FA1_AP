package waserete;

public class Wasmachine extends Kleding implements Wasje{
    private int tempC;
    private int rpm;
    private int nummer;

    public Wasmachine(String kleur, String stof, int tempC, int rpm, int nummer) {
        super(kleur, stof);
        this.tempC = tempC;
        this.rpm = rpm;
        this.nummer = nummer;
    }

    public int getTempC() {
        return tempC;
    }

    public int getRpm() {
        return rpm;
    }

    public int getNummer() {
        return nummer;
    }

    @Override
    public String toString() {
        return "Wasmachine{" +
                "temp_c=" + tempC +
                ", rpm=" + rpm +
                ", nummer=" + nummer +
                '}';
    }
}
