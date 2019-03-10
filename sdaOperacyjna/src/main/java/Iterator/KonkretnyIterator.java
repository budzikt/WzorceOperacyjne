package Iterator;

public class KonkretnyIterator extends Iterator {

    private KolekcjaElementow kolekcja;
    private int obecnyElement;
    private int ostatniElement;

    KonkretnyIterator(KolekcjaElementow kol) {
        this.kolekcja = kol;
        obecnyElement = 0;
        ostatniElement = kol.pobierzDlugoscKolekcji();
    }

    public boolean maKolejnyElement() {
        return obecnyElement < ostatniElement;
    }

    public Iterable pobiezElement() {
        return kolekcja.pobierzElement(obecnyElement);
    }

    public boolean czyKoniec() {
        return obecnyElement == ostatniElement;
    }

    public void nastepny() throws Exception {
        obecnyElement++;
        if(obecnyElement > ostatniElement) {
            throw new Exception("Taki indeks nie istnieje");
        }
    }
}
