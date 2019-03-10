package Iterator;

public abstract class Iterator {
    public abstract boolean maKolejnyElement();
    public abstract Iterable pobiezElement();
    public abstract boolean czyKoniec();
    public abstract void nastepny() throws Exception;

}
