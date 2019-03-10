package Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        KolekcjaElementow kolekcja = new KolekcjaElementow();
        kolekcja.dodajDoKolekcji(new Iterable())
                .dodajDoKolekcji(new Iterable())
                .dodajDoKolekcji(new Iterable())
                .dodajDoKolekcji(new Iterable())
                .dodajDoKolekcji(new Iterable());

        Iterator iterator = kolekcja.pobierzIterator();
        while(!iterator.czyKoniec()) {
            System.out.println(iterator.pobiezElement().getKolor());
            try {
                iterator.nastepny();
            } catch (Exception e) {
                System.out.println("Poza idneksem!");
            }
        }
    }
}
