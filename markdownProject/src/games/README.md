#### Why use a concrete method in an abstract class ?
[source](https://stackoverflow.com/questions/56960959/what-is-the-purpose-of-concrete-methods-in-abstract-classes-in-python)

All the subclasses which extend the abstract class might have a common behaviour, using the same method.
Instead of implementing the same method in each and every subclass, it is implemented at a higher level
(abstract class) which is then used by **all** subclasses.

It avoids repetition; no need to implement the same method in each class. If there's a change to be done,
it can be done in one place only (abstract class).
---
#### What is the difference between an abstract method and a concrete one?

The abstract methods do not need to be implemented in the abstract class, only declared;
by using the **abstract** keyword
```java
public abstract void myAbstractMethod();
```
The concrete methods need to be implemented; meaning the body of the method needs to be written.

---
#### Can an abstract class be instantiated ?
[source](https://stackoverflow.com/questions/13670991/can-we-instantiate-an-abstract-class)

The instance created if of an anonymous class, not that of the abstract class.

---



```java
/*
the abstract class cannot be instantiated. I cannot use the "new" keyword.
Abstract classes are only inherited ("extends" keyword)
*/

public abstract class games.AbstractBall {
    /*
    declaring the method abstract means, I do not need to implement it.
    I do not need to write the body, only the declaration.
    The writing is left to the subclasses that inherit it
    */
    public abstract int hit(int speed);

    /*
        declaring a method not abstract (omitting the abstract keyword)
        means I need to implement it -> writing the body of the method.
     */
    public int hitV2 (int speed){
        return 1;
    }
}
```
## Abstract class vs Interface

An interface is similar to an abstract class but the methods are all abstract.
The methods are not implemented, only defined. It can contain constant fields (final).

A class can only extend ONE other class, but it can implement multiple interfaces.
By default all methods in an interface are public and abstract.

*public* - it can be accessed by any other class
*abstract* - no implementation, only declaration
```java
public void play();
```
---
#### What is the difference between abstract classes and interfaces ?
> However, with abstract classes, you can declare fields that are not static and final, and define
> public, protected, and private concrete methods.
> With interfaces, all fields are automatically public, static, and final, and all methods
> that you declare or define (as default methods) are public. In addition, you can extend only one class,
> whether or not it is abstract, whereas you can implement any number of interfaces.

[source](https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html)

---
#### Which to use ?

    Consider using abstract classes if any of these statements apply to your situation:
        You want to share code among several closely related classes.
        You expect that classes that extend your abstract class have many common methods or fields, 
        or require access modifiers other than public (such as protected and private).
        You want to declare non-static or non-final fields. This enables you to define methods that can access 
        and modify the state of the object to which they belong.
    Consider using interfaces if any of these statements apply to your situation:
        You expect that unrelated classes would implement your interface. For example, 
        the interfaces Comparable and Cloneable are implemented by many unrelated classes.
        You want to specify the behavior of a particular data type, but not concerned about who implements its behavior.
        You want to take advantage of multiple inheritance of type.


[source](https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html)

---
#### What is a marker interface ?
//TODO to google more

---

