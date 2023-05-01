package ch.gibb.firma;

public class Firma {
    private Person[] mitarbeiter;
    public Firma (Person[] p) {
        mitarbeiter = p;
    }

    public Person[] getMitarbeiter() {
        return mitarbeiter;
    }
    public Person getMitarbeiter(int positon) {
        if(positon<mitarbeiter.length){
        return mitarbeiter[positon];
        }
        else return null;
    }

    public void setMitarbeiter(Person[] mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }

    public void mittarbeiterHinzufugen(Person person){
        //  New array with 1 size increase
        Person[] mitarbeiterNew = new Person[this.mitarbeiter.length+1];
        // Copy everything from the old array into the new longer one
        for (int i = 0; i < this.mitarbeiter.length; i++) {
            mitarbeiterNew[i] = this.mitarbeiter[i];
        }
        //adding the new person on the last field from the array
        mitarbeiterNew[mitarbeiterNew.length-1] = person;
        //replacing the instance array with the new one.
        this.mitarbeiter = mitarbeiterNew;
    }
}
