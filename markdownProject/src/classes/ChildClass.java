package classes;

import com.sun.security.jgss.GSSUtil;

/*
    ChildClass is a subclass of ParentClass
 */
public class ChildClass extends ParentClass{
    private String child;
    public String childParentString = "this is a child class string";

    public ChildClass(){
        this.setParent("this is set from ChildClass");
        this.setChild("this is set from ChildClass");
    }
    public String getChild() {
        return child;
    }

    public void setChild(String child) {
        this.child = child;
    }

   public void getMethodFromParent(){
        parentPublicMethod();
   }

    ParentClass parentClass = new ParentClass();

    public void getSuper(){
        System.out.println(childParentString);
        System.out.println(super.childParentString);
    }

//    public void getParentString(){
//        System.out.println(parentClass.parent); // protected access modifier here
//    } // cannot access it parent string is private as access modifier


}
