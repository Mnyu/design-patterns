package creational._04_singleton._03_lazy_init_thread_safety;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
// Don't create the instance upfront, rather only create when somebody asks for it the first time.

// PROBLEM WITH LAZY INITIALIZATION
// ====================================
// POTENTIAL RACE CONDITION : If several threads accessing the getInstance method and calling it the same time,
// there can be a situation where say 2 or more threads initialize the instance, and it might be sensitive for teh singleton class.

// SOLUTIONS :
// =================
// 1. Make the getInstance() method synchronized. But this has performance implications.
// 2. Double-Checked Locking - this approach is outdated and should not be used.
