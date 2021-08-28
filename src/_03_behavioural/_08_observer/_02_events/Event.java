package _03_behavioural._08_observer._02_events;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Event<T> {

    private int count = 0;
    private Map<Integer, Consumer<T>> handlers = new HashMap<>();

    public Subscription addHandler(Consumer<T> handler) {
        int i = count;
        handlers.put(count++, handler);
        return new Subscription(this, i);
    }

    public void fire(T t) {
        for (Consumer<T> handler : handlers.values()) {
            handler.accept(t);
        }
    }

    class Subscription implements AutoCloseable {

        private Event<T> event;
        private int id;

        public Subscription(Event<T> event, int id) {
            this.event = event;
            this.id = id;
        }

        @Override
        public void close() /*throws Exception*/ {
            event.handlers.remove(id); // Unsubscribe logic
        }
    }

}
// 1. Encapsulate the idea of something happening.
// 2. You will subscribe to this event to get notifications.
// 3. You can also unsubscribe.
