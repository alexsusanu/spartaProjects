package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        Object v = Optional.ofNullable("hello")
//                .orElseGet(() -> "default");

//        Object v = Optional.ofNullable(null)
//                .orElseThrow(() -> new IllegalStateException("exception"));

        Optional.ofNullable(null)
                .ifPresentOrElse(System.out::println,
                                () -> System.out.println("cannot send"));

//        System.out.println(v);
    }
}
