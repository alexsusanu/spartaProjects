## Enums

A convenient way to use names instead of numbers. Can be thought of as a collection of 
constants.

[source](https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html)

---

```java
    //1 -> RED; 2 -> GREEN
    //example with and without enums

    if(color == 1){
        //print red
    }else if(color == 2){
        //print green
    }
    
    enum Color {Red, Green}
    
    if (color == Color.Red){
        //print red
    }else if(color == Color.Green){
        //print green    
    }
```
---

a list of named constants. the keyword *final* can behave in the same way.
In Java enumerations can be made into classes, have constructors and methods therefore be more powerful than *final*.

