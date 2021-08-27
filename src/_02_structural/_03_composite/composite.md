## COMPOSITE PATTERN

### MOTIVATION

- Objects use other objects' fields/methods through inheritance and composition.
- Composition lets us make compound objects.

    - E.g. a mathematical expression composed of simple expressions.
    - A shape group made of several shapes.

- Composite design pattern is used to treat both single(scalar) and composite objects uniformly.

  - i.e Foo and List<Foo> have common APIs.

### Composite :
    A mechanism for treating individual scalar objects and compositions of objects in a uniform manner.


### SUMMARY

- Some composed and singular objects need similar/identical behaviours.
- Composite design pattern lets us treat both types of objects uniformly.
- Java supports container iteration with the ```Iterable<T>``` interface.
- A single object can masquerade as a collection by returning a single-element collection containing only ```this``` i.e. ```Collections.singleton(this)```.
- Neuron and NeuronLayer example.