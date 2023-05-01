package ch.gibb.firma;

public class Chef extends Person {
    private String abteilung;

    public Chef(String name, String vorname, int personalNummer, String abteilung) {
        super(name, vorname, personalNummer);
        this.abteilung = abteilung;
    }

    public String getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }
    @Override
    public void print(){
        super.print();
        System.out.println(abteilung);
    }

    @Override
    public int berechneFerien(int alter) {
        if (alter > 54) {
            return 6;
        } else if (alter > 44) {
            return 5;
        }
        return 4;
    }
}
