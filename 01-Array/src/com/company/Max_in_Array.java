package com.company;

public class Max_in_Array {
    public static void main(String[] args) {

        int [] arr = {1, 23, 45, 433, 134, 55};

        // Function call for finding maximum element in array
         maximum(arr);
     }

    // created a function to find max element in array
    static void maximum(int[] arr){

        int max = arr[0];
        for(int i = 0; i<arr.length; i++){

            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
