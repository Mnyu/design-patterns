package creational._04_Singleton._04_inner_static_singleton;

public class InnerStaticSingleton {

    private InnerStaticSingleton() {}

    private static class Impl {
        private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
    }

    public InnerStaticSingleton getInstance() {
        return Impl.INSTANCE;
    }
}
// This has the same behaviour in terms of supporting the idea of Thread safety but does not require the synchronized usage.
// The idea is to create a static nested class. This static nested class will have a static nested member that will be exposed.

// IMPORTANT :
// ===============
// This approach avoids the problem of synchronization.
// It effectively guarantees that whenever we initialize instance, we get the same instance.
// => No need to take care of Thread safety.


