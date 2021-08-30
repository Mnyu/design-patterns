## STATE PATTERN

### STATE:
    A pattern in which the object's behaviour is determined by its state.
    An object trasitions from one state to another(something needs to trigger a transition).
    A formalized construct which manages state and transitions is called a state machine.

### SUMMARY

- Given sufficient complexity, it pays to formally define possible states and events/triggers.
- We can define :

    - State entry/exit behaviours.
    - Action when a particular event causes a transition.
    - Guard conditions enabling/disabling a transition.
    - Default action when no transitions are found for an event.