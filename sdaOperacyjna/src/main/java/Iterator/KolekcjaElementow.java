package Iterator;

import java.util.ArrayList;
import java.util.List;

public class KolekcjaElementow {
    private List<Iterable> iterableList;

    public KolekcjaElementow() {
        this.iterableList = new ArrayList<Iterable>();
    }

    public KolekcjaElementow dodajDoKolekcji(Iterable it) {
        iterableList.add(it);
        return this;
    }

    public int pobierzDlugoscKolekcji() {
        return this.iterableList.size();
    }

    public Iterable pobierzElement(int index) {
        return iterableList.get(index);
    }

    public Iterator pobierzIterator() {
        return new KonkretnyIterator(this);
    }
}
