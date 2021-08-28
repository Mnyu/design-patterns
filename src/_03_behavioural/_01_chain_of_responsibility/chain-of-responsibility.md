## CHAIN OF RESPONSIBILITY PATTERN

### MOTIVATION

- Example 1 : Unethical behaviour by an employee; who takes the blame?

    - Employee
    - Manager
    - CEO

- Example 2 : You click a graphical element on a form; who handles the event?

    - Button handles it, stops further processing
    - Underlying group box
    - Underlying window.

- All these are examples of chain of responsibility.

#### Command Query Separation

  - Idea is whenever we operate on objects, we separate all the invocations into 2 different concepts, *Query* and *Command*.
  - Command : asking for an action or change(e.g. set your attack value to 2).
  - Query : asking for information(e.g. give me your attack value)
  - With chain of responsibility we can also have other listeners to this command/query, and they can override the actual behaviour of the command/query.
 

### CHAIN OF RESPONSIBILITY :
    A chain of components who all get a chance : 
        i. to process a comamnd or query,
        ii. optionally having default processing implementation and
        iii. an ability to terminate the processing chain.

### SUMMARY

- Chain of Responsibility can be implemented as :

  - a chain of references(chain the method calls) or
  - a centralized construct (like the event broker)

- Idea in both cases : Enlist objects in the chain, possibly controlling their order.

- Object removal from chain (e.g. in AutoCloseable close()).