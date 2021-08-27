## FACTORY PATTERN

### MOTIVATION

- Object creation logic becomes too convoluted
- Constructor is not descriptive

    - Name mandated by name of the containing type.
    - Cannot overload with same sets of args with different names.
    - Can turn into 'overloading hell'

- Wholesale object creation (non-piece-wise, unlike builder) can be outsourced to

  - A separate function (FACTORY METHOD)
  - That may exist in a separate class (FACTORY)
  - We can create hierarchy of factories with ABSTRACT FACTORY

### FACTORY :
      A component responsible solely for the wholesale(not piece-wise) creation of objects.
  
 
### SUMMARY

- Factory Method : static method that creates object.
- Factory Class : can take care of object creation.
- Factory Class can be external or reside inside the object as an inner class.
- Hierarchies of factories can be used to create related objects. 