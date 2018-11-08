import java.util.Timer;

public class Application {
    public static void main(String[] args) {
        Ensemble e = new Ensemble(4);

        StopWatch timer = new StopWatch().start();

        for (int i = 0; i < 100; i++) {
            e.insert(i);
        }




    }
}
