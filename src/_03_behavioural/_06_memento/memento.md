## MEMENTO PATTERN

### MOTIVATION

- An object or system goes through changes.
  
  - e.g. a bank account gets deposits and withdrawals.
  
- There are different ways of navigating those changes.
- 1 way : is to record every change(Command pattern) and teach a command to undo itself.
- Another way : is to simply save snapshots of the system and then allow the user to roll back the system to a particular snapshot.


### MEMENTO :
    Kind of a token/handle (returned from a method typically) representing the system state.
    Lets us roll back to the state when the token was generated.
    Token may or may not directly expose state information, but it is typically an immutable construct.

### SUMMARY

- Mementos are used to roll back(undo/redo) states arbitrarily.
- A memento is simply a token/handle class with typically no functions of its own.
- A memento is not required to expose directly the state(s) to which it reverts the system. 
- Basically that state should not be editable, can be readable.