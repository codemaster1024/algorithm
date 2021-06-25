package cn.qiyiyu.utils;

/**
 * @author wangqiang
 * @date 2021-06-25 14:48
 */
public class ArrayUtils {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void print(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
