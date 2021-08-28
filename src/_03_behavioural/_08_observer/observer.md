## OBSERVER PATTERN

### MOTIVATION

- We need to be informed when certain things happen.

    - Object's field changes.
    - Object does something.
    - Some external event occurs.

- We want to listen to events and be notified when they occur.
- Old typical pattern involves ```addXxxxListerner()```.
- Modern Java - easier to builder observers and observables as it has functional objects.

    - If you want some action to occur, wrap that action in a ```Supplier<T>```,```Consumer<T>``` or```Function<T>```,
    - Store these objects in an array and fire them whenever necessary.

### OBSERVER AND OBSERVABLE:
    An observer is an object that wishes to be informed about events happening in the system.
    The entity generating the events is an Observable.

### SUMMARY

- An observable must provide and event to subscribe to.
- Special care must be taken to prevent issues in multi-threaded scenarios.