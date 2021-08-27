## PROXY PATTERN

## MOTIVATION
- You are calling ```foo.bar()```.
- This assumes that ```foo``` is in the same process as ```bar()```
- What if, later on, you want to put all ```foo``` related operations into a separate process

  - Can you avoid changing your code?
- Proxy to the rescue!

    - Same interface, entirely different behaviour

- This is called *Communication Proxy*
- Other types : *Logging, Virtual, Guarding etc.*

### PROXY :
    A class that functions as an interface to a particular resource. That resource may be remote, expensive to construct, or may require logging or some other added functionality. 

### SUMMARY

- A proxy has the same interface as the underlying object.
- The goal of proxy is to kind of change the behaviour of an object behind the scenes but preserve the interface that everyone is used to.
- To create a proxy, simply replicate the existing interface of an object
- Add relevant functionality to refined member functions.
- Different proxies(communication, logging, caching etc.) have completely different behaviours.