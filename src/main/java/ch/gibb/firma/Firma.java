package ch.gibb.firma;

public class Firma {
    private Person[] mitarbeiter;
    public Firma (Person[] p) {
        mitarbeiter = p;
    }

    public Person[] getMitarbeiter() {
        return mitarbeiter;
    }

    public void setMitarbeiter(Person[] mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }
}
