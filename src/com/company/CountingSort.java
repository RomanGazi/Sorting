package com.company;

import java.util.Arrays;

public class CountingSort {
    public static void startSorting(int ar[]) {
        countingSort(ar);
        print(ar);

    }

    private static void countingSort(int[] ar) {
        int max = ar[0];
        for (int i = 0; i < ar.length - 1; i++) {
            if (max < ar[i + 1]) {
                max = ar[i + 1];
            }
        }

        int output[] = new int[max + 1];

        for (int i = 0; i < ar.length; i++) {
            output[ar[i]] = output[ar[i]] + 1;
        }

        int index = 0;
        for (int i = 0; i < output.length; i++) {
            while (0 < output[i]) {
                ar[index++] = i;
                output[i]--;
            }
        }
    }

    public static void print(int [] ar) {
        System.out.println("Counting Sort: ");
        System.out.println(Arrays.toString(ar));
    }
}
