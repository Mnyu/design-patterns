## PROTOTYPE PATTERN

### MOTIVATION

- Complicated objects(e.g. cars) are not designed from scratch.
  - They reiterate existing designs.
- An existing (partially or fully constructed) design is a Prototype.
- We make a copy/clone the existing object and customize it.
    - Requires "deep copy support"
- Make cloning convenient (e.g. via a Factory)

### PROTOTYPE :
    A partially or fully initialized object that you copy/clone and make use of.


### SUMMARY

- To implement a prototype, partially construct an object and store it somewhere.
- How to clone the prototype :

  - Implement own deep copy functionality - Copy Constructor - becomes complex for large hierarchical objects.
  - Serialize and De-Serialize the complete object graph.
- Customize the resulting instance according to needs.