package bridge;

/**
 * Created by eugen on 20.08.2015.
 */
public class BMWProcessor implements AutoProcessor {
    @Override
    public Auto create() {
        return new BMW();
    }

    @Override
    public void run(Auto a) {
        ((BMW)a).run();
    }
}
