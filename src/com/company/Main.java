package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = input.nextInt();
        int[] arrNumber = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the ["+i+"] element:");
            arrNumber[i] = input.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arrNumber[i] + "\t");
        }
        System.out.println("\n");
        int min = arrNumber[0];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if(arrNumber[i] < arrNumber[0]) {
                min = arrNumber[i];
                index = i;
            }
        }
        System.out.println("The min element in array is: " + min + " at position " + index);
    }
}
