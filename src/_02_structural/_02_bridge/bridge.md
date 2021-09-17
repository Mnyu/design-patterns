## BRIDGE PATTERN

### MOTIVATION

- Bridge prevents a 'Cartesian product' complexity explosion.
- Example

  - Base class ThreadScheduler
  - Can be pre-emptive or co-operative (PTS : PreemptiveThreadScheduler & CTS : CooperativeThreadScheduler)
  - Can run on Windows or Unix
  - We end up with 2 x 2 scenario: 
    
    - WindowsPTS
    - UnixPTS
    - WindowsCTS
    - UnixCTS
- Bridge pattern avoids the entity explosion.

#### Problem
![Before](https://github.com/Mnyu/design-patterns/blob/main/src/_02_structural/_02_bridge/before.png)

#### Solution
![After](https://github.com/Mnyu/design-patterns/blob/main/src/_02_structural/_02_bridge/after.png)


### BRIDGE :
    A mechanism that decouples an interface(hierarchy) from an implementation(hierarchy).


### SUMMARY

- Decouple abstraction from implementation.
- Both can exist as hierarchies.
- We can think bridge as a stronger from of encapsulation.

  
    
  
   
     