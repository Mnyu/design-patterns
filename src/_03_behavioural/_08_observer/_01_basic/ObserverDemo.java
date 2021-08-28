package _03_behavioural._08_observer._01_basic;

public class ObserverDemo implements Observer<Person> {

    public ObserverDemo() {
        Person person = new Person();
        person.subscribe(this);
        for (int i = 20; i < 24; i++) {
            person.setAge(i);
        }
    }

    @Override
    public void handle(PropertyChangedEventArgs<Person> args) {
        System.out.println("Person's " + args.getPropertyName() + " has changed to : " + args.getNewValue());
    }

    public static void main(String[] args) {
        new ObserverDemo();
    }
}
// There are problems with this approach, should not be the preferred approach.
// Preferred approached should be the one with the idea of events.

