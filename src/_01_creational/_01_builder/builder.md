## BUILDER PATTERN  

### MOTIVATION

- Some objects are simple and can be created in a single constructor call.
- Other objects require a lot of ceremony to create.
- Having an object with 10 constructor args is not productive
- Instead, opt for a piece-wise construction.
- Builder provides API for constructing an object step-by-step or piece-by-piece. 

### SUMMARY

- A builder is a separate component for building an object.
- We can either give builder a constructor or return it via a static function.
- To make builder fluent, return ```this``` of builder.
- Different facets of an object can be built with different builders working in tandem via a base class.
