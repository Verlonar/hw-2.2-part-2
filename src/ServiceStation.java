import java.util.ArrayList;

public class ServiceStation {

    public void check(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();
        }
    }

    public void check(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            car.updateTyre();
        }
        car.checkEngine();
    }

    public void check(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            truck.updateTyre();
        }
        truck.checkEngine();
        truck.checkTrailer();
    }

    public void check(ArrayList<Mechanism> mechanisms) {

        for (Mechanism mechanism : mechanisms) {

            if (Bicycle.class.equals(mechanism.getClass())) {
                check((Bicycle) mechanism);

            } else if (Car.class.equals(mechanism.getClass())) {
                check((Car) mechanism);

            } else if (Truck.class.equals(mechanism.getClass())) {
                check((Truck) mechanism);
            }
        }
    }
}
