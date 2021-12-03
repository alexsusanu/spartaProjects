package classes;

public class Driver {
    public static void main(String[] args) {
       ParentClass parentClass = new ParentClass();
       ChildClass childClass = new ChildClass();
       ParentClass childParentClass = new ChildClass();

        System.out.println(parentClass.getParent());
        System.out.println(childClass.getChild());
        System.out.println(childParentClass.getParent());

        System.out.println(childClass.childParentString); // ChildClass level

        System.out.println(childParentClass.childParentString); // ParentClass level
        System.out.println(childParentClass.getSuperParentString());



    }
}
