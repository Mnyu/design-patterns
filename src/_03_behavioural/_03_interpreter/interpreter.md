## INTERPRETER PATTERN

### MOTIVATION

- Textual input needs to be processed

  - e.g. turned into OOP structures.

- Examples :

    - Programming languages compilers, interpreters and IDEs.
    - HTML, XML etc.
    - Numeric expressions
    - Regular expressions

- Turning strings into OOP based structures is a  fairly complicated process, that is why this design pattern exists because it is a separate problem within computer science.

### INTERPRETER :
    A component that processes structured text data. 
    Does so by turning it into separate lexical tokens(LEXING) and the interpreting sequences of these tokens(PARSING).
    
