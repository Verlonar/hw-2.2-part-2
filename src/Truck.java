public class Truck extends Mechanism implements MechanismService {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
        System.out.println("Проверяем двигатель");
        System.out.println("Проверяем прицеп");
    }
}