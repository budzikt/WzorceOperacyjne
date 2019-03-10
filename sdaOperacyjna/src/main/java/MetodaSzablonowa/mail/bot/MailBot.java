package MetodaSzablonowa.mail.bot;

public abstract class MailBot {

    private String glownaTresc;

    public String napiszMailing() {
        return napiszNaglowek()
                + '\n'
                + napiszTresc()
                + '\n'
                + napiszStopke();
    }

    public MailBot() {
        this.glownaTresc = "Niezdefiniowana glowna tresc maila";
    }

    protected MailBot(String glownaTresc){
        this.glownaTresc = glownaTresc;
    }
    protected abstract String napiszNaglowek();
    protected abstract String napiszStopke();
    protected String napiszTresc() {
        return this.glownaTresc;
    }

}
