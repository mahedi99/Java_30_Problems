package algorithms;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Mahedi Hassan
 * 2020-05-10
 */

public class MergeSort {
    public static void main(String a[]){
        int[] arr = new int [] {2,7,8,5,4,3};
        mergeSort(arr, arr.length);
        Arrays.stream(arr).forEach(System.out::print);
    }

    public static void mergeSort(int arr[], int n){
        if (n < 2){
            return;
        }
        int mid = n / 2;
        int l[] = new int[mid];
        int r[] = new int[n - mid];
        for (int i = 0; i < mid; i++){
            l[i] = arr[i];
        }
        for (int i = mid; i < n; i++){
            r[i - mid] = arr[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n- mid);

        merge(arr, l, r, mid, n - mid);
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right){
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left){
            a[k++] = l[i++];
        }
        while (j < right){
            a[k++] = r[j++];
        }
    }
}
