package org.example;

public class Problem6 {

    int [][] transpose(int[][] arr){
        int n = arr.length, m = arr[0].length;
        int transposed[][] = new int[m][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                transposed[j][i] = arr[i][j];
            }
        }
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(transposed[i][j]+ " ");
            }
            System.out.println();
        }
        return transposed;
    }
}
