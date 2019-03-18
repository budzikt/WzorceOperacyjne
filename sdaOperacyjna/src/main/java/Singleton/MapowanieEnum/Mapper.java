package singleton.MapowanieEnum;

public class Mapper {
    public enum Stan {LADNIE, NIELADNIA, OK};
    private Stan s;

    public Mapper(Koszula k, Spodnie s) {
        if(k == Koszula.LADNA && s == Spodnie.LADNE) {
            this.s = Stan.LADNIE;
        }
        else if(k == Koszula.NIELADNA && s == Spodnie.NIELADNE) {
            this.s = Stan.NIELADNIA;
        }
        else {
            this.s = Stan.OK;
        }
    }

    public Stan getStan() {
        return this.s;
    }
}
