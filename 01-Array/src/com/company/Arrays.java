package com.company;

public class Arrays {
    public static void main(String[] args) {

        // we can create array like this
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        display(arr);
    }

    static void display(int [] arr){

        // traversing the array via for loops
        for(int i= 0; i< arr.length; i++){

            //printing elements of array
            System.out.print(arr[i]);
        }
    }
}
