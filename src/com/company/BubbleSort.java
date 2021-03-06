package com.company;

import java.util.Arrays;

// Sorting by swapping element
public class BubbleSort {

    public static void startSorting(int ar[]) {
        bubbleSort(ar);
    }

    public static void bubbleSort(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    swap(ar, j);
                }
            }
        }
        System.out.println("Bubble Sort:");
        System.out.println(Arrays.toString(ar));
    }

    public static void swap(int ar[], int index) {
        int temp = ar[index];
        ar[index] = ar[index + 1];
        ar[index + 1] = temp;
    }

}
