package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.nextLine();
        Problem1 p1 = new Problem1();
        boolean res = p1.isPalindrome(word);
        System.out.println(res);
        ////////////////
        System.out.println("Enter a string to encode");
        String str = sc.nextLine();
        Problem3 p2 = new Problem3();
        String encodedStr = p2.runLengthEncode(str);
        System.out.println(encodedStr);

        System.out.println("Enter a string to decode");
        String str2 = sc.nextLine();
        String decodedStr = p2.runLengthDecode(str2);
        System.out.println(decodedStr);



    }

}