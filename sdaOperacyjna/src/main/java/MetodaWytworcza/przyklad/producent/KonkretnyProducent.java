package MetodaWytworcza.przyklad.producent;

import MetodaWytworcza.przyklad.produkt.Product;
import MetodaWytworcza.przyklad.produkt.ProduktKonkretny;

public class KonkretnyProducent extends Producent {

    /*TU JEST WZORZEC*/
    @Override
    protected Product wytworzProdukt() {
        return new ProduktKonkretny("Konkretny Produkt");
    }
}
