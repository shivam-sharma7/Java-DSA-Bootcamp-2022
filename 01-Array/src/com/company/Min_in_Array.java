package com.company;

public class Min_in_Array {
    public static void main(String[] args) {

        int [] arr = {1, 23, 45, 433, 134, 55};

        // Function call
        minimum(arr);
    }

    // created a function to find max element in array
    static void minimum(int[] arr){

        int min = arr[0];
        for(int i = 0; i<arr.length; i++){

            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}
