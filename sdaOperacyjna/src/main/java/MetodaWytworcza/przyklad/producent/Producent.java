package MetodaWytworcza.przyklad.producent;

import MetodaWytworcza.przyklad.produkt.Product;

public abstract  class Producent {

    private Product produkt;

    public Producent() {
        /*TU JEST WZORZEC*/
        this.produkt = this.wytworzProdukt();
    }

    /*TU JEST WZORZEC*/
    protected abstract Product wytworzProdukt();

    public String jakiMamProdukt() {
        return  this.produkt.przedstawSie();
    }

    public Product getProdukt() {
        return produkt;
    }
}
