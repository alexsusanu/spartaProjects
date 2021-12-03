package games;

/*
    the abstract class cannot be instantiated. I cannot use the "new" keyword.
    Abstract classes are only inherited ("extends" keyword)
 */
public abstract class AbstractBall {
    /*
        declaring the method abstract means, I do not need to implement it.
        I do not need to write the body, only the declaration.
        The implementation is left to the subclasses that inherit it.
     */
    public abstract int hit(int speed);

    /*
        declaring a method not abstract (omitting the abstract keyword)
        means I need to implement it -> writing the body of the method.
        The implementation happens in the abstract class, not in the subclass.
        The subclass only uses the method already implemented.
     */
    public int hitV2 (int speed){
        return 1;
    }
}
