package MetodaSzablonowa;

import MetodaSzablonowa.mail.bot.MailBot;
import MetodaSzablonowa.mail.bot.NowyKlientMailBot;

public class MetodaSzabonowaMain {
    public static void main(String[] args) {

        MailBot nowy = new NowyKlientMailBot("Sprawdz nasza nowa oferte!");

        System.out.println(nowy.napiszMailing());

    }
}
