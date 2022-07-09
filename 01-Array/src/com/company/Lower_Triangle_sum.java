package com.company;

public class Lower_Triangle_sum {
    public static void main(String[] args) {

        int [][] arr = {
                {1, 3, 5},
                {1, 4, 8},
                {1, 2, 5},
        };

        int sum = 0;

        UpperTriangle(arr, sum);
    }

    static void UpperTriangle(int[][] arr, int sum){

        for(int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (i > j) {

                    sum += arr[i][j];

                }
            }
        }
        System.out.println(sum);
    }
}