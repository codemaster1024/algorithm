package cn.qiyiyu.insertion;

import cn.qiyiyu.utils.ArrayUtils;

/**
 * @author wangqiang
 * @date 2021-06-25 14:47
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {9, 3, 1, 4, 6, 8, 7, 5, 2};
        sort(arr);
        ArrayUtils.print(arr);
    }

    static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {//抽出一张牌来
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]) {//一直拿着抽出来的那张牌跟j-1比，小的话会换位置，比不动的时候，前面一定是有序的，不用担心换错。

                    ArrayUtils.swap(arr, j, j-1);
                }
            }

        }

    }
}
