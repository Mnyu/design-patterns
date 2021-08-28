package _03_behavioural._07_null_object;

import java.lang.reflect.Proxy;

public class NullObjectDemo {

    @SuppressWarnings("unchecked")
    // Dynamic Proxy Concept
    public static <T> T noOp(Class<T> intrface) {
        return (T) Proxy.newProxyInstance(
                intrface.getClassLoader(),
                new Class<?>[] {intrface},
                ((proxy, method, args) -> {
                    if(method.getReturnType().equals(Void.TYPE))
                        return null;
                    else
                        return method.getReturnType().getConstructor().newInstance();
                })
        );
    }

    public static void main(String[] args) {
        Log log = new ConsoleLog();
        BankAccount account = new BankAccount(log);
        account.deposit(500);

        // BankAccount account1 = new BankAccount(null); // This will cause NPE, instead use below
        Log nullLog = new NullLog();
        BankAccount account1 = new BankAccount(nullLog);
        account1.deposit(500);

        // Dynamic Proxy Concept
        Log log2 = noOp(Log.class);
        BankAccount account2 = new BankAccount(log2);
        account2.deposit(500);
    }
}
