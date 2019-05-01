package com.company;

public class SelectionSort {
    public static int findingMinimum(int ar[], int startIndex) {
        int minValue = ar[startIndex];
        int minIndex = startIndex;
        for (int i = minIndex + 1; i < ar.length; i++) {
            if (ar[i] < minValue) {
                 minValue = ar[i];
                 minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swap(int ar[], int fisrtIndex, int secondIndex) {
        int temp;
        temp = ar[fisrtIndex];
        ar[fisrtIndex] = ar[secondIndex];
        ar[secondIndex] = temp;
    }

    public static void startSorting(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            int index = findingMinimum(ar,i);
            swap(ar,i,index);
        }
        System.out.println("Selection Sort");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
