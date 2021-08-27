## FLYWEIGHT PATTERN

### MOTIVATION

- Avoid redundancy when storing data
- Example 1 : Massive Multiplayer Online Game

    - Plenty of users with identical first/last names
    - No sense in storing same first/last name over and over again
    - Store a list of names and pointers to them.

- Example 2 : bold, italic text in the console

    - Don't want each character to have a formatting character
    - Operate on ranges (e.g. line number start/end positions)

- *Example 2 makes more sense.*

### FLYWEIGHT :
    A space optimization teachnique that lets us use less memory by storing externally the data associated with similar objects

