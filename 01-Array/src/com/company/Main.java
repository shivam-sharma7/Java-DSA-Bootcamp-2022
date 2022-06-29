package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
	// taking array as a user define
        Scanner in = new Scanner(System.in);

        int [] arr = new int[5];

        for (int i = 0; i< arr.length; i++){

           arr[i] = in.nextInt();
        }
        for (int i = 0; i< arr.length; i++){

            System.out.println(arr[i]);
        }
    }
}
