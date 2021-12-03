package com.sparta.palindrome;

public class PalindromeDriver {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        String word = "racecar";
//        System.out.println(palindrome.isPalindrome(word));
//        System.out.println(palindrome.isPalindromeWithStringBuilder(word));
//        System.out.println(palindrome.isPalindromeV2(word));
        System.out.println(palindrome.isPalindrome(null));
    }
}
