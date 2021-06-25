package cn.qiyiyu.bubbleSort;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * @author wangqiang
 * @date 2021-06-23 17:12
 */
public class BubbleSortUp {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 6, 8, 7, 5, 9};
        sort(arr);
        print(arr);
    }

    static void sort(int[] arr) {
        boolean flag = true;
        for (int i = arr.length-1; i >0 ; i--) {
            for (int j = 0; j < 6; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                     flag = false;
                }
            }
            if (flag) {
                break;
            }
        }

    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

