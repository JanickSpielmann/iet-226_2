package ch.gibb.firma;

public class Lehrling extends Person{

    private int lehrjahr;

    public Lehrling(String name, String vorname, int personalNummer, int lehrjahr) {
        super(name, vorname, personalNummer);
        this.lehrjahr = lehrjahr;
    }

    public int getLehrjahr() {
        return lehrjahr;
    }

    public void setLehrjahr(int lehrjahr) {
        this.lehrjahr = lehrjahr;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(lehrjahr);
    }
    @Override
    public int berechneFerien(int alter) {
        return 5;
    }
}
