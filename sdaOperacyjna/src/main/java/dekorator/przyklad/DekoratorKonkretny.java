package dekorator.przyklad;

public class DekoratorKonkretny extends Dekorator {

    public DekoratorKonkretny(int cena, Dekorowalny elementDoUdekorowania) {
        super(cena, elementDoUdekorowania);
    }

    @Override
    public int pobierzCene() {
        System.out.println("To jest udekorowany element");
        return super.pobierzCene();
    }
}
