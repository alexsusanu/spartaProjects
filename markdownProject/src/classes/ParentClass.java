package classes;

public class ParentClass {
    private String parent;
    public String childParentString = "this is a parent string";

    public ParentClass(){
        this.parent = "this is a parent class";
    }

    public String getSuperParentString() {
        return childParentString;
    }

    public void setSuperParentString(String superParentString) {
        this.childParentString = superParentString;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    private void parentPrivateMethod(){
        System.out.println("This is a parent private method");
    }

    public void parentPublicMethod(){
        System.out.println("This is a parent public method");
    }
}
