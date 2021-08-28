package _03_behavioural._08_observer._01_basic;

public interface Observer<T> {

    void handle(PropertyChangedEventArgs<T> args);
    // The idea is if you want to monitor an object of type T, then you implement the Observer<T> interface.
    // You define your own handle method and then hope that handle method will be executed
    // whenever somebody actually performs some changes on T.
}

// Observer is an interface that we would expect to be implemented by anyone interested in observing an object of type T.
