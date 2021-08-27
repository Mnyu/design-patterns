package _02_structural._04_decorator._04_adapter_decorator;

public class AdapterDecoratorDemo {
    public static void main(String[] args) {
        MyStringBuilder msb = new MyStringBuilder();
        msb.append("hello").appendLine(" world");
        System.out.println(msb.concat("add this too"));
    }
}
// It is also possible to build AdapterDecorator - merge Adapter and Decorator patterns.
// Decorator : provides additional functionality.
// Adapter : tries to mimic some interfaces and make some things easy to use.
