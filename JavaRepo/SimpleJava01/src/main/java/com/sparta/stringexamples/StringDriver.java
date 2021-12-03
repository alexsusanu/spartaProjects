package com.sparta.stringsExamples;

public class StringDriver {
    public static void main(String[] args) {
        String s1 ="hello";
        String s2 = "hello";
        String s3 = new String("hello"); //// creates new object not in pool

        System.out.println(s1 == s2); // compares object references, memory address

        System.out.println(s1 == s3); // different objects
        s3 = s3.intern(); // moves it into the pool
        System.out.println(s1 == s3); // same object now

        System.out.println(s1.equals(s3)); // compares values, not object reference, memory address

        String leo = "leo";
        String yefri = "yefri";

        StringBuilder stringBuilder = new StringBuilder(yefri);
        stringBuilder.append("Velasquez");
        stringBuilder.insert(5, " ");
        System.out.println(stringBuilder);


        StringBuffer stringBuffer = new StringBuffer(yefri);
        stringBuffer.append(" hello");
        System.out.println(stringBuffer);

        String fullName = stringBuffer.toString();
        fullName = fullName.replace("yefri", "jason");
        System.out.println(fullName);


    }
}
