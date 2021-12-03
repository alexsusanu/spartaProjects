package com.sparta.palindrome;

public class Palindrome {
    public boolean isPalindrome(String word){
        if(word == null){
            return false;
        }
        if(word.isEmpty()){
            System.out.println("Empty string");
            return false;
        }
        String[] wordArray = word.split("");
        int len = wordArray.length - 1;
        int i = 0;

        while(i < len){
            if (!(wordArray[i].equalsIgnoreCase(wordArray[len]))){
                return false;
            }
            i++;
            len--;
        }
        return true;
    }

    public boolean isPalindromeWithStringBuilder(String word){
        StringBuilder stringBuilder = new StringBuilder(word);
        return word.equalsIgnoreCase(stringBuilder.reverse().toString());
    }

    public boolean isPalindromeV2(String word){
        String[] stringArray = word.split("");

        for(int i = 0, len = stringArray.length - 1; i < len; i++, len--){
            if(!(stringArray[i].equalsIgnoreCase(stringArray[len]))){
                return false;
            }
        }
        return true;
    }

    public boolean checkEqualityFirstAndLastLetter(String word){
        return word.charAt(0) == word.charAt(word.length() - 1);
    }

    // TODO
//    public boolean isPalindromeV3(String word){
//        int len = word.length();
//        int middle = len / 2;
//
//        for(int i = 0; i < middle; i++){
//            if(word.charAt(i) != word.charAt(middle - i - 1)){
//                return false;
//            }
//        }
//        return true;
//    }
}
