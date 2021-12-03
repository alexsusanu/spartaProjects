package com.sparta.nestedexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NestedDriver {
    // named nested/inner class
//    private class CarComparator implements Comparator<Car> {
//        @Override
//        public int compare(Car o1, Car o2) {
//            return o1.getMake().compareTo(o2.getMake());
//        }
//    }
    public static void main(String[] args) {
        NestedDriver nestedDriver = new NestedDriver();
        nestedDriver.sortList();
    }

    public void sortList(){
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Renault","Captur", 4));
        carList.add(new Car("Vaxuhall","Corsa", 2));
        carList.add(new Car("Ferrari","F370", 2));
        carList.add(new Car("Ford","Focus", 4));

        // anonymous inner class
//        Collections.sort(carList, new Comparator<Car>(){
//            public int compare(Car o1, Car o2) {
//                return o1.getMake().compareTo(o2.getMake());
//            }
//        });

        // lambdas
        Collections.sort(carList, (o1, o2) -> o1.getMake().compareTo(o2.getMake()));
        System.out.println(carList);
    }
}
