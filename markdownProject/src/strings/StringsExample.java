package strings;

public class StringsExample {
    public static void main(String[] args) {
//        System.out.println("Greek alphabet: ");
//        for(int i = 913; i <= 937; i++){
//            System.out.println((char) i);
//        }

        // strings are immutable
        String name = "Alan";
        String upperName = name.toUpperCase();
        System.out.println(name); // variable name 'Alan' has not been modified
        System.out.println(upperName); // new variable created
        System.out.println(name.toUpperCase()); // even without assign to a new var, the old one remains unchanged
        System.out.println(name); // variable name 'Alan' has not been modified
    }
}
