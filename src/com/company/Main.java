package com.company;

public class Main {

    public static void main(String[] args) {
        int arr[] = {2,6,7,8,1,12,3,10,4};
        SelectionSort selectionSort = new SelectionSort();
        //selectionSort.startSorting(arr);
        new InsertionSort().startSorting(arr);
    }
}
