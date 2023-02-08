package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter a word");
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
        System.out.println(decodedStr);*/

        ///////////
//        Problem4 p4 = new Problem4();
//        int result = p4.compose.apply(6);
//        System.out.println(result);

        ////////
//        Problem5 p5 = new Problem5();
//        p5.unique(new String[]{"apples", "oranges", "flowers", "apples"});
        /////////
//        Problem6 p6 = new Problem6();
//        p6.transpose(new int [][]{ { 1,2,3,4 }, { 5,6,7,8 } });
        ////////

//        Problem8 p8 = new Problem8();
//        int indx = p8.getFirstDuplicate(new int[] {10, 5, 3, 4, 3, 5, 6});
//        System.out.println(indx);
//
        ////////

        BinaryTree tree = new BinaryTree();
        tree.constructTree();
        System.out.println(tree.sumOfNodes());
    }

}