package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.nextLine();
        Problem1 obj = new Problem1();
        boolean res = obj.isPalindrome(word);
        System.out.println(res);
    }

}