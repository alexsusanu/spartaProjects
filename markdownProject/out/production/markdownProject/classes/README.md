## Classes

    [source: Think Java by Allen B. Downey & Chris Mayfield book]

All classes inherit from *Object*. Everything in Java is an object.
Primitives are not objects.

A class is a logical construct, an object is the physical reality.

Define a new class to encapsulate related data under one roof, to be treated as a single unit.

Can be thought of as a collection of related methods *OR* a template for new objects (a certain type of objects).

```java
@Override
public String toString(){
    //overriding the toString method
        return this.getClass().getName() + "["
        + this.firstName + " "
        +this.lastName + "]";
}
```

---
Everytime you declare a class, you create a new type of that name.

A new type *Hello*.
```java
public class Hello(){
    public void helloWorld(){
        System.out.println("Hello World");
    }
}
```

```java
public static void main(String[] args){
    Hello hello = new Hello();
    // a new object of type Hello
}
```
---

---
//TODO
cloning
equal
hashcode

---
*equals* vs *==*

*==* checks for object equality. if the two objects are the same, meaning they are the same object.

*equals* checks for value, if they have the same value.

---

## Access modifiers

---
**private**

    accessible only from the top-level class it is declared. not accessible by subclasses

---

**package-private**

    accessible by any class in the package. this is the default access if no access modifiers are mentioned.
    except interfaces where all members are public.

---

**protected**

    accessible from subclasses or any class in the package

---

**public**

    accessible from anywhere, any package.

---

The class Time is public and be access from anywhere, but the class variables (hour, minutes, seconds) are private
therefore only accessible by the class itself.

In order to access private members, use getters and setters.
```java
    public class Time(){
        private int hour;
        private int minutes;
        private int seconds;
    }    
```
---

A constructor creates an instance of the class. In this case it does not take any params
and defaults all the class variables to 0.
Constructors can be overloaded, having multiple constructors with different params.
```java
    public Time(){
        // constructor
        this.hour = 0;
        this.minutes = 0;
        this.seconds = 0;
    }   
```
---

