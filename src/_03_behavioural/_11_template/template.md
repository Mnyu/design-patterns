## TEMPLATE PATTERN

### MOTIVATION

- Algorithms can be decomposed into common parts + specifics.
- Strategy pattern does this through *composition*.

    - High level algorithm uses an interface.
    - Concrete implementations implement the interface.

- Template method does the same thing through *inheritance*.

    - Overall algorithm makes use of abstract member.
    - Inheritors override the abstract members.
    - Parent template method invoked.

### TEMPLATE :
    Allows us to define the 'skeleton' of the algorithm in Base class, with concrete implementations defined in sub-classes. 

### SUMMARY

- Define an algorithm at a high level in abstract class with 1 non-abstract member where the algorithm resides and a bunch of abstract definitions.
- Define the constituent parts as abstract methods/properties.
- Inherit from the algorithm class and provide the necessary overrides.
- Now the whole thing plays together, the base class template method(containing the algo) gets invoked and inside it invocations of overriding properties/methods take place.
