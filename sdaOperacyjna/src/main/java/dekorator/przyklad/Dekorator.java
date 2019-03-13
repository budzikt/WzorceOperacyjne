package dekorator.przyklad;

public abstract class Dekorator extends Dekorowalny {

    private Dekorowalny dekorowanyElement;

    public Dekorator(int cena, Dekorowalny elementDoUdekorowania) {
        super(cena);
        this.dekorowanyElement = elementDoUdekorowania;
    }

    @Override
    public int pobierzCene() {
        return this.getCena() + this.dekorowanyElement.pobierzCene();
    }
}
