import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Mechanism> mechanisms = new ArrayList<>();

        mechanisms.add(new Car("car1", 4));
        mechanisms.add(new Car("car2", 4));
        mechanisms.add(new Truck("truck1", 6));
        mechanisms.add(new Truck("truck2", 8));
        mechanisms.add(new Bicycle("bicycle1", 2));
        mechanisms.add(new Bicycle("bicycle2", 2));

        ServiceStation station = new ServiceStation();

        station.check(mechanisms);
    }
}