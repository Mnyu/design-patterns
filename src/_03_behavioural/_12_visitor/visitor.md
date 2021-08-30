## VISITOR PATTERN

### MOTIVATION

- Need to define a new operation on an entire class hierarchy.

    - e.g. make a document model printable to HTML/Markdown.

- We do not want to keep modifying every class in the hierarchy, as it breaks OCP principle.
- Need access to the non-common aspects of classes in the hierarchy.
- Create an external component to handle rendering

    - But avoid type checks.

### VISITOR :
    A pattern where a component(visitor) is allowed to traverse the entire inheritance hierarchy.
    Implemented by propagating a single visit() method throughout the entire hierarchy.

### SUMMARY

- Propagate an ```accept(Visitor v)``` method throughout the entire hierarchy.
- Create a visitor with ```visit(Foo f)```, ```visit(Bar b)``` and so on for each element in the hierarchy.
- Each ```accept()``` simply calls ```visitor.visit(this)```.
- Acyclic visitor allows greater flexibility at a cost of performance.
