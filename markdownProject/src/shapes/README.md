#### Abstract factory vs Factory

---
>Abstract factory adds another level of abstraction to factory method. While factory method abstracts the way objects are created, abstract factory abstracts how the factories are created. The factories in turn abstracts the way objects are created. You will often hear the abstract factory design pattern referred to as a “factory of factories“.

>From implementation point of view, the key difference between the factory method and abstract factory patterns is 
that factory method is just a method to create objects of a single type, 
while abstract factory is an object to create families of objects.

>Another difference is that the factory method pattern uses inheritance while the abstract factory pattern 
uses composition. We say that that factory method uses inheritance because this pattern relies on a subclass 
for the required object instantiation. Recall in the Factory Method Design Pattern post where we created a createPizza()
factory method in an abstract base class and implemented the factory method 
in a PizzaFactory subclass for the required Pizza object instantiation. On the other hand, 
the abstract factory pattern delegates responsibility to a separate object (abstract factory) dedicated to create 
a family of related objects. Then, through composition, the abstract factory object can be passed to the client 
who will use it (instead of factory method) to get the family of related objects.

[source](https://springframework.guru/gang-of-four-design-patterns/abstract-factory-design-pattern/)

---

