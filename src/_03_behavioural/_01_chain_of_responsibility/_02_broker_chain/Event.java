package _03_behavioural._01_chain_of_responsibility._02_broker_chain;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Event<Args> {
    private int index = 0;
    private Map<Integer, Consumer<Args>> handlers = new HashMap<>();

    public int subscribe(Consumer<Args> handler) {
        int i = index;
        handlers.put(index++, handler);
        return i;
    }

    public void unsubscribe(int key) {
        handlers.remove(key);
    }

    public void fire(Args args) {
        for (Consumer<Args> handler : handlers.values()) {
            handler.accept(args);
        }
    }
}
// Events class is going to notify us on queries. (Idea of command query separation)
// Here we will have an ability to subscribe to an event, unsubscribe to an event and fire an event
