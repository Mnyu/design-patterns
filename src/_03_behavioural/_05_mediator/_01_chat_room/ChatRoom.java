package _03_behavioural._05_mediator._01_chat_room;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    private List<Person> people = new ArrayList<>();

    public void join(Person p) {
        String joinMsg = p.getName() + " joined the room!!!";
        broadcast("room", joinMsg);
        p.setRoom(this);
        people.add(p);
    }

    public void broadcast(String from, String msg) {
        for (Person p : people) {
            if (!p.getName().equals(from)) {
                p.receive(from, msg);
            }
        }
    }

    public void message(String from, String to, String msg) {
        people.stream()
            .filter(p -> p.getName().equals(to))
            .findFirst()
            .ifPresent(p -> p.receive(from, msg));
    }
}
