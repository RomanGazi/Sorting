package com.company;

// Find the appropriate position and then shift the element

import java.util.Arrays;

public class InsertionSort {
    public static void startSorting(int ar[]) {
        insertionSort(ar);
    }

    public static void insertionSort(int ar[]) {
        int j, key, i;
        for (i = 1; i < ar.length; i++) {
            j = i;
            while (j > 0 && ar[j - 1] > ar[j]) {
                key = ar[j - 1];
                ar[j - 1] = ar[j];
                ar[j] = key;
                j--;
            }
        }
        System.out.println("Insertion Sort:");
        System.out.println(Arrays.toString(ar));
    }
}
