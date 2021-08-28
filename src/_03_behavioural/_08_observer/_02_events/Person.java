package _03_behavioural._08_observer._02_events;

public class Person {

    private Event<PropertyChangedEventArgs> event = new Event<>();

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (this.age == age) {
            return;
        }
        this.age = age;
        event.fire(new PropertyChangedEventArgs(this, "age"));
    }

    public Event<PropertyChangedEventArgs> getEvent() {
        return event;
    }
}
