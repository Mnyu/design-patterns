## NULL OBJECT PATTERN

### MOTIVATION

- When component A uses component B, it typically assumes that B is non-null.

    - You inject B, not some ```Optional<B>``` type.
    - You do not check for null on every call.

- There is no option of telling A not to use an instance of B

  - Its use is hard coded.

- Thus, we build a no-op, non-functioning inheritor of B(or some interface that B implements) and pass it into A.

### NULL OBJECT :
    A no-op object that conforms to the required interface, satisfying a dependency requirement of some other object.

### SUMMARY

- Implement the required interface.
- Rewrite the methods with empty bodies
  
  - If method is non-void, return default value of a given type.
  - If these values are ever used, you are in trouble.

- Supply an instance of Null Object in place of actual object and cross your fingers.

- So, Null Object is not the safest of design patterns, but sometimes it does make sense to supply it.

- E.g. to run a unit test instead of an integration test, when we want a part to be substituted, but we don't have the option to use dependency injection for that particular case.  