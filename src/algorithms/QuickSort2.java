package algorithms;

import java.util.Arrays;

/**
 * @author Mahedi Hassan
 * 2020-08-31
 */

public class QuickSort2 {

    public static void main(String args[]){
        int a [] = new int[]{1,3, 12, 4, 5};
        quickSort(a, 0, a.length - 1);

        Arrays.stream(a).forEach(System.out::println);
    }

    private static void quickSort(int[] a, int low, int high) {
        int i = low;
        int j = high;
        int pivot = a[low + (high-low)/2];
        while (i <= j){
            while (a[i] < pivot){
                i++;
            }
            while (a[j] > pivot){
                j--;
            }
            if (i <= j){
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                i++;
                j--;
            }

            if (low < j){
                quickSort(a, low, j);
            }
            if (high > i){
                quickSort(a, i, high);
            }
        }
    }
}
