package callback;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        hello("alex", null, v -> {
            System.out.println("not provided");
        });
    }

    static void hello(String first, String last, Consumer<String> callback){
        System.out.println(first);
        if(last != null){
            System.out.println(last);
        }else{
            callback.accept(first);
        }
    }
}
