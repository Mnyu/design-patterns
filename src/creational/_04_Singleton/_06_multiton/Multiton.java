package creational._04_Singleton._06_multiton;

import java.util.HashMap;

enum Subsystem {
    PRIMARY,
    AUXILIARY,
    FALLBACK
}

class Printer {

    private static int instanceCount = 0;
    private static HashMap<Subsystem, Printer> instances = new HashMap<>();

    private Printer() {
        instanceCount++;
        System.out.println("A total of " + instanceCount + " instances created so far");
    }

    public static Printer get(Subsystem ss) {
        if (instances.containsKey(ss)) {
            return instances.get(ss);
        }
        Printer printer = new Printer();
        instances.put(ss, printer);
        return printer;
    }
}

public class Multiton {
    public static void main(String[] args) {
        Printer main = Printer.get(Subsystem.PRIMARY);
        Printer aux = Printer.get(Subsystem.AUXILIARY);
        Printer aux1 = Printer.get(Subsystem.AUXILIARY);
    }
}
// Idea : Multiton, unlike Singleton, does not make sure that there is only 1 instance, rather,
// multiton  maintains a finite set of instances and for each instance we can have additional benefits like lazy initialization etc.
