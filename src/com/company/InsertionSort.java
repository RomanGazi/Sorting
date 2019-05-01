package com.company;

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
        System.out.println("Insertion Sort");
        for (int k = 0; k < ar.length; k++) {
            System.out.println(ar[k]);
        }
    }
}
