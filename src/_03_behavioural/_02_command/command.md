## COMMAND PATTERN

### MOTIVATION

- Ordinary Java statements are perishable.

  - Cannot undo a field assignment.
  - Cannot directly serialize a sequence of actions(calls).

- Want an object that represents an operation
  
  - X should change its field Y to value Z.
  - X should do w().
  
- Uses of this pattern:
  
  - GUI commands : e.g. we might have a top level menu and a toolbar which both save a file. So in both cases, the file save operation will be wrapped in a command that will be sent to some sort of command processor. 
  - multi-level undo/redo.
  - macro recording etc.


### COMMAND :
    Generally, it is a single object or combination of objects which represent an instruction that needs to be performed.
    A command typically contains all the information for a particular action to be taken.

### SUMMARY

- Encapsulate all details of an operation in a separate object.
- Advantages of object is we can serialize it, store it in memory/disk, easier to work with, and we can roll back the operations.
- Define instructions for applying the command (either in the command itself or elsewhere).
- Optionally define instructions for undoing the command.
- Create composite commands(a.k.a macros/combos) - can be rolled back too.