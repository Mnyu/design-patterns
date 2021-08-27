package _02_structural._07_proxy._02_dynamic_proxy;

import java.lang.reflect.Proxy;

public class DynamicProxyDemo {

    @SuppressWarnings("unchecked")
    public static <T> T withLogging(T target, Class<T> intrface) {
        return (T) Proxy.newProxyInstance(
                intrface.getClassLoader(),
                new Class<?>[] {intrface},
                new LoggingHandler(target)
        );
    }

    public static void main(String[] args) {
        Person person = new Person();
        Human logged = withLogging(person, Human.class);
        logged.talk();
        logged.walk();
        logged.walk();
        System.out.println(logged);
    }
}
