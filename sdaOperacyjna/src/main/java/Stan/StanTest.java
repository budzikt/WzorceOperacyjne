package Stan;

public class StanTest {
    public static void main(String[] args) {
        Pacjent[] pacjenci = new Pacjent[10];
        for(int i = 0; i < 10; i++) {
            pacjenci[i] = new Pacjent();
        }

        for(int i = 0; i < 50; i++) {
            System.out.println("Dzien " + i + 1);
            for(Pacjent p : pacjenci) {
                System.out.println(p.nowyDzienWSzpitalu());
            }
        }
    }
}
