import java.util.ArrayList;

public class ServiceStation {

    public void check(ArrayList<MechanismService> mechanisms) {

        for (MechanismService mechanism : mechanisms) {
            mechanism.check();
        }
    }
}
