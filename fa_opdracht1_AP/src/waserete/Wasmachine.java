package waserete;

public class Wasmachine extends Kleding implements Wasje{
    private int temp_c;
    private int rpm;
    private int nummer;

    public Wasmachine(String kleur, String stof, int temp_c, int rpm, int nummer) {
        super(kleur, stof);
        this.temp_c = temp_c;
        this.rpm = rpm;
        this.nummer = nummer;
    }

    public int getTemp_c() {
        return temp_c;
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
                "temp_c=" + temp_c +
                ", rpm=" + rpm +
                ", nummer=" + nummer +
                '}';
    }
}
