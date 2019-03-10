package LancuchZobowiazan;

public class LancuchTest {
    public static void main(String[] args) {
        Handler h = new Handler50();
        h.ustawNastepny(new Handler70());

        System.out.println(h.obsluz(40));
        System.out.println(h.obsluz(60));
        //System.out.println(h.obsluz(230));
    }
}
