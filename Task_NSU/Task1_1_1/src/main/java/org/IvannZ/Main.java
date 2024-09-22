package org.IvannZ;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Enter len arr:");
        Scanner scan = new Scanner(System.in);
        int len_arr = scan.nextInt();
        int[] arr = new int[len_arr];
        for (int i = 0; i < len_arr; i++) {
            arr[i] = scan.nextInt();
        }

//        create_bin_heap(arr, arr.length);
        heap_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * this funktion sort arr
     *
     * @param arr array to sort
     */
    public static void heap_sort(int[] arr) {
        create_bin_heap(arr, arr.length);
        for (int i = arr.length - 1; i > 0; i--) {
            int e = arr[0];
            arr[0] = arr[i];
            arr[i] = e;
            create_bin_heap(arr, i);
        }
    }


    /**
     * this function make bin_heap from arr
     *
     * @param arr is array to change
     * @param len is len of arr
     */
    public static void create_bin_heap(int[] arr, int len) {
        for (int i = 1; i < len; i++) {
            for (int j = i; j != 0; j = (j - 1) / 2) {
                if (arr[j] > arr[(j - 1) / 2]) {
                    int e = arr[j];
                    arr[j] = arr[(j - 1) / 2];
                    arr[(j - 1) / 2] = e;
                } else {
                    break;
                }
            }
        }
    }
}