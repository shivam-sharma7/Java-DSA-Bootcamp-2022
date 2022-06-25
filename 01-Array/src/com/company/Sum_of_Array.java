package com.company;

public class Sum_of_Array {
    public static void main(String[] args) {

    int [] arr = {5, 58, 50, 60, 80};

    sum_Of(arr);

   }

    static void sum_Of(int [] arr){

        int sum = 0;
        for(int i = 0; i< arr.length; i++){

            sum+= arr[i];
        }
        System.out.println(sum);
    }
}
