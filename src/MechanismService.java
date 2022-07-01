public interface MechanismService {

    default void check() {
        System.out.println("Нечего проверять");
    }
}
