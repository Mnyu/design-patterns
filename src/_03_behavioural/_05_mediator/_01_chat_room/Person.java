package _03_behavioural._05_mediator._01_chat_room;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private ChatRoom room;
    private List<String> chatLog = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public void receive(String sender, String msg) {
        String s = sender + " : '" + msg + "'";
        System.out.println("["+ name +"'s chat session] -> " + s);
        chatLog.add(s);
    }

    public void say(String msg) {
        room.broadcast(name, msg);
    }

    public void privateMsg(String who, String msg) {
        room.message(name, who, msg);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChatRoom getRoom() {
        return room;
    }

    public void setRoom(ChatRoom room) {
        this.room = room;
    }

    public List<String> getChatLog() {
        return chatLog;
    }

    public void setChatLog(List<String> chatLog) {
        this.chatLog = chatLog;
    }
}
