## DECORATOR PATTERN

### MOTIVATION

- Want to augment an object with additional functionality.
- Do not want to re-write or alter existing code for extension (OCP principle)
- Want to keep new functionality separate (SRP principle)
- Need to be able to interact with existing structures i.e. the new construct/decorated object should be compatible with an API that uses the old object.
- 2 Options :

  *1. Inherit from required object, if possible; some classes  are final.*

  *2. Build a Decorator, which simply references the existing/decorated object(s).* 

### DECORATOR :
    Facilitates the addition of behaviours to individual objects without inheriting from them.

### SUMMARY

- A decorator keeps the reference to the decorated object(s).
- May or may not forward calls.

  - IDE can generate Delegated Members.

- Exists in a static variation.

  - ```X<Y<Foo>>(/* unpleasant constrcutors */)```
  - Limited in Java due to 
    
    - Type erasure
    - Inability to inherit from type parameters

  - Downside of static decorator : composition can't be changed at run time.

- Dynamic Decorator

  - composition can happen at runtime which can be of benefit.