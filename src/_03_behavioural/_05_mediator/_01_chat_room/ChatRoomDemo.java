package _03_behavioural._05_mediator._01_chat_room;

public class ChatRoomDemo {
    public static void main(String[] args) {
        ChatRoom room = new ChatRoom();

        Person john = new Person("John");
        Person mark = new Person("Mark");

        room.join(john);
        room.join(mark);

        john.say("Hi room!!!");
        mark.say("oh, hey John :)");

        Person simon = new Person("Simon");
        room.join(simon);

        simon.say("Hi Everyone!");
        mark.privateMsg("Simon", "Glad you could join!");
    }
}
