package ch.gibb.firma;

public class Fachangestellte extends Person {

    private Chef vorgesetzter;

    public Fachangestellte(String name, String vorname, int personalNummer, Chef vorgesetzter) {
        super(name, vorname, personalNummer);
        this.vorgesetzter = vorgesetzter;
    }

    public Chef getVorgesetzter() {
        return vorgesetzter;
    }

    public void setVorgesetzter(Chef vorgesetzter) {
        this.vorgesetzter = vorgesetzter;
    }

    @Override
    public void print() {
        super.print();
        vorgesetzter.print();
    }
}
