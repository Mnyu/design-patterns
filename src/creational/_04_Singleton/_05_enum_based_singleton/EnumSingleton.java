package creational._04_Singleton._05_enum_based_singleton;

public enum EnumSingleton {
    INSTANCE;

    private int value;

    // public constructors can not be created for enums. They are always private.
    EnumSingleton() {
        value = 42;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
// Idea is : Instead of making a class, we make enum.
// enum is a class, except it has finite number of instances

// This singleton does not have previous problem like reflection scenario.
// But it has serialization problems. Enums don't save state (int his e.g. value).
// No inheritance possible in case of enums.
// Use this approach considering these limitations.



