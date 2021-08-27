## ADAPTER PATTERN

### ADAPTER :
    A construct(class/interface) which adapts an existing interface X to conform to the required interface Y.

This means if we are getting an interface X from some system but some other system requires interface Y, so what you have to do in order to connect X with Y is : write some extra piece of code to make that possible.

Real life example:

- X = US electric board 3 pin socket.
- Y = Indian laptop charger plug.

Can't insert Y into X directly.

- Extra Code = Universal Adapter. 
- Final Result = Y ---> Adapter ---> X

### SUMMARY

- Implementing an adapter is easy
- Determine the API you have and the API you need.
- Create a component which aggregates(has reference to) the adaptee.
- Intermediate representations can pile up. Use cleanup, caching and other optimizations.