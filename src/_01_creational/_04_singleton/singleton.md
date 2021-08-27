## SINGLETON PATTERN

### MOTIVATION

- For some components it only makes sense to have 1 instance in the system
    
    - Object Factory - no state involved
    - Database repository

- In situations for e.g. the constructor call is expensive.
  
    - We only do it once.
    - We provide everyone with the same instance.

- We want to prevent anyone from creating additional copies.

- Need to take care of lazy instantiation and thread safety. 

### SINGLETON :
    A component which is instantiated only once.

### SUMMARY

- Making a 'safe' singleton is easy : construct a static Lazy<T> and return its value.
- InnerStaticSingleton.
- Singletons are difficult to test.
- Instead of directly using a singleton, consider depending on an abstraction (e.g. an interface).
- Consider defining singleton lifetime in DI (dependency injection) container.