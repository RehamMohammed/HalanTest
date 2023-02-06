package org.example;

public class Problem1 {
    boolean isPalindrome (String word){
        boolean flag = false;
        for (int i=0;i<word.length();i++){
            if (word.charAt(i) != word.charAt(word.length()-i-1))
                flag = true;
                break;
        }

        if (flag) return false;
        else return true;
    }
}
