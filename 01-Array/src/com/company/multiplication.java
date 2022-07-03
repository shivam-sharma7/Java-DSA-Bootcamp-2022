package com.company;

public class multiplication {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 7};

        multiplication(arr);
    }

    static void multiplication(int[] arr){

        int multi = arr[0];
        for(int  i=1; i<arr.length; i++){

            multi*= arr[i];
        }

        System.out.println(multi);
    }
}
