package org.example;

import java.util.HashSet;

public class Problem8 {
    int getFirstDuplicate(int[] arr){
        int indx = -1;
        HashSet<Integer> nums = new HashSet<>();

        for (int i=arr.length-1; i>=0; i--){
            if (nums.contains(arr[i])){
                indx = i;
            }
            else nums.add(arr[i]);
        }
       return indx;
    }
}
