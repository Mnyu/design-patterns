## ITERATOR PATTERN

### MOTIVATION

- Iteration(traversal) is a core functionality of various data structures.

- An *iterator* is a class that facilitates the traversal

    - Keeps a reference to the current element.
    - Knows how to move to a different element.

- Java has ```Iterator<T>``` and ```Iterable<T>```.
    
  - ```Iterator<T>``` specifies the iterator API.
  - A class need to be ```Iterable``` in order to support ```for(Foo foo : bar)``` loops.

### ITERATOR :
    An object that facilitates the traversal of a data structure.

### SUMMARY

- An iterator specifies how you can traverse a collection.
- Iterator cannot be recursive(no coroutines).