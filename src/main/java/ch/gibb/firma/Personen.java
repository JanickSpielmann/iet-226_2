package ch.gibb.firma;

public class Personen {
    public static void main(String[] args) {


        Firma f = new Firma(
                new Person[]{new Chef("Sattler", "Beatrice", 25, "Verkauf")});

        f.mittarbeiterHinzufugen(new Chef("Müller", "Martin", 156, "Logistik"));
        f.mittarbeiterHinzufugen(new Lehrling("Nica", "Luca", 924, 4));
        f.mittarbeiterHinzufugen(new Lehrling("Flück", "Marcel", 100, 3));
        f.mittarbeiterHinzufugen(new Fachangestellte("Gates","Bill",230, (Chef) f.getMitarbeiter(0)));
        for (Person person: f.getMitarbeiter()) {
            System.out.println(person.name + " hat "+ person.berechneFerien(55) + " Tage Ferienanspruch");
            System.out.println();
        }
    }
}
