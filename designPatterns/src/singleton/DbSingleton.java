/*
    lazy loaded -> create the instance when its needed, not when the class is loaded
    volatile -> the variable changes at runtime and the compiler should not cache the value
 */


package singleton;

public class DbSingleton {
    private static volatile DbSingleton instance = null;
//    private static DbSingleton instance = null; -> lazy loaded
//    private static DbSingleton instance = new DbSingleton(); -> eagerly loaded, creates the instance when the class
//                                                                 is called

    private DbSingleton(){ // one constructor, private, no args
        if(instance != null){
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingleton getInstance(){
        if(instance == null){
            synchronized (DbSingleton.class) {
                if(instance == null) {
                    instance = new DbSingleton(); // lazy loaded
                }
            }
        }
        return instance;
    }
}
