package creational._04_singleton._01_basic_singleton;

public class BasicSingleton {

    private static final BasicSingleton INSTANCE = new BasicSingleton();

    private int value = 0;

    private BasicSingleton() {}

    public static BasicSingleton getINSTANCE() {
        return INSTANCE;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        BasicSingleton instance = BasicSingleton.getINSTANCE();
        instance.setValue(123);
        System.out.println(instance.getValue());
    }
}
// This is the very basic simplest approach to create singleton.

// PROBLEMS WITH THIS SINGLETON :
// ==================================
// 1. Reflection : Using reflection we can reach the private constructor and defeat the whole purpose of singleton by creating copies.
// 2. Serialization De-Serialization : Create new copies with Serialization De-Serialization. Solution - readResolve() method.

