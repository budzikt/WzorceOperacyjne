package MetodaWytworcza.przyklad;

import MetodaWytworcza.przyklad.producent.KonkretnyProducent;
import MetodaWytworcza.przyklad.producent.Producent;
import MetodaWytworcza.przyklad.produkt.Product;

public class Main {
    public static void main(String[] args) {

        Producent p = new KonkretnyProducent();
        System.out.println("Nic nie zrobiłem, a mam dobry produkt:");
        System.out.println(p.jakiMamProdukt());
        System.out.println("Jak potrzebuje, to uzywam go poza producentem");
        Product product = p.getProdukt();
        System.out.println(product.getName());

    }
}
