package _03_behavioural._08_observer._02_events;

public class EventsDemo {
    public static void main(String[] args) {
        Person person = new Person();
        Event<PropertyChangedEventArgs>.Subscription sub = person.getEvent().addHandler(x -> {
            System.out.println("Person's " + x.getPropName() + " has changed");
        });
        person.setAge(17);
        person.setAge(18);
        sub.close();
        person.setAge(19);
    }
}
// TAKEAWAY :
// ==================
// Instead of forcing classes to implement Observer<T> and Observable<T> as shown in basic example,
// better to use Events - which is nothing but a container of subscriptions and to fire event, go through all
// subscriptions and fire each and let the handlers receive the arguments and do something with them.
