package dekorator.przyklad;

public abstract class Dekorowalny {
    private int cena;

    public Dekorowalny(int cena) {
        this.cena = cena;
    }

    public int getCena() {
        return cena;
    }

    public int pobierzCene() {
        return this.getCena();
    }

}
