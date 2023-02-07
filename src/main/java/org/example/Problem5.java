package org.example;

import java.sql.Array;
import java.util.ArrayList;

public class Problem5 {
    ArrayList<String> unique(String [] arr){

        ArrayList<String> res = new ArrayList<>();
        for (int i=0;i<arr.length; i++){
            boolean isExist = false;
            for (int j=0; j<arr.length; j++){
                if (i != j && arr[i] == arr[j]){
                    isExist = true;
                    break;
                }
            }
            if (!isExist) res.add(arr[i]);
        }

        if (res.size() == 0) return new ArrayList<>(0);

        else {
            for (int i = 0; i < res.size(); i++) {
                System.out.print(res.get(i));
                System.out.print(" ");
            }
        }

        return res;
    }
}
