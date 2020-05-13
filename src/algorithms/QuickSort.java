package algorithms;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Mahedi Hassan
 * 2020-05-10
 */

public class QuickSort {

    public static void main(String[] a){

        int[] arr = new int [] {2,7,8,5,4,3,2};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr, 0, arr.length -1);

        Arrays.stream(arr).forEach(System.out::print);
    }

    public void quickSort(int arr[], int begin, int end){
        if (begin < end){
            int partitionIndex = partition(arr, begin, end);
            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private int partition(int[] arr, int begin, int end){
        int pivot = arr[end];
        int i = (begin - 1);
        for (int j = begin; j < end; j++){
            if (arr[j] <= pivot){
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }

        int tmp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = tmp;

        return i+1;
    }
}
