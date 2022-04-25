public interface MechanismService {
    default void updateTyre() {
        System.out.println("Нет покрышек");
    }

    default void checkEngine() {
        System.out.println("Нет двигателя");
    }

    default void checkTrailer() {
        System.out.println("Нет прицепа");
    }
}
