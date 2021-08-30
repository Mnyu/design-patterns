## STRATEGY PATTERN

### MOTIVATION

- Many algorithms can be decomposed into higher and lower level parts.
- Making tea can be decomposed into :
    
    - High Level : The process of making a hot beverage (boil water, pour into cup) and
    - Low Level : Tea-specific things(put teabag into water)

- The high level algorithm can then be reused for making coffee or hot chocolate.

    - Supported by beverage-specific *strategies*.

### STRATEGY :
    Enables the exact behaviour of a system to be selected either at run-time(dynamic) or compile time(static).
    Also known as Policy(esp. in the C++ world).

### SUMMARY

- Define an algorithm at a high level. 
- Define the interface you expect each strategy to follow.
- Provide for either dynamic or static *composition of strategy* in the overall algorithm.

