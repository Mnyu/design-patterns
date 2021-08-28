package _03_behavioural._08_observer._01_basic;

import java.util.ArrayList;
import java.util.List;

public class Observable<T> {

    private List<Observer<T>> observers = new ArrayList<>();

    public void subscribe(Observer<T> observer) {
        observers.add(observer);
    }

    protected void propertyChanged(T source, String propertyName, Object newValue) {
        for (Observer<T> observer : observers) {
            observer.handle(new PropertyChangedEventArgs<T>(source, propertyName, newValue));
        }
    }
}
// This class is going to have :
// 1. List of all the subscribers that are watching a particular class of objects(T)
// 2. Some sort of API for actually subscribing to this observable to monitor changes.
// 3. Mechanism to notify on property changes, so whoever inherits from Observable needs to fire some method
//    to actually notify each observer that something has happened.
