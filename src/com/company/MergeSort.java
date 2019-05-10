package com.company;

// Divide and conquer rule

import java.util.Arrays;

public class MergeSort {

    public static void startSorting(int ar[]) {
        mergeSort(ar, 0, ar.length - 1);
    }

    private static void mergeSort(int[] ar, int firstIndex, int lastIndex) {
        int middleIndex;
        if(firstIndex < lastIndex) {
            middleIndex = (firstIndex + lastIndex) / 2;
            mergeSort(ar, firstIndex, middleIndex);
            mergeSort(ar, middleIndex + 1, lastIndex);
            merge(ar, firstIndex, middleIndex, lastIndex);
        }
    }

    private static void merge(int[] ar, int firstIndex, int middleIndex, int lastIndex) {
        int length1 = middleIndex - firstIndex + 1;
        int length2 = lastIndex - middleIndex;
        int L[] = new int[length1];
        int R[] = new int[length2];

        for (int i = 0; i < length1; ++i) {
            L[i] = ar[firstIndex + i];
        }

        for (int i = 0; i < length2; ++i) {
            R[i] = ar[middleIndex + 1 + i];
        }

        int i = 0, j = 0;

        int k = firstIndex;

        while (i < length1 && j < length2) {
            if (L[i] <= R[j]) {
                ar[k] = L[i];
                i++;
            } else {
                ar[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < length1) {
            ar[k] = L[i];
            i++;
            k++;
        }

        while (j < length2) {
            ar[k] = R[j];
            j++;
            k++;
        }
    }

    public static void print(int [] ar) {
        System.out.println("Merge Sort:");
        System.out.println(Arrays.toString(ar));
    }
}
