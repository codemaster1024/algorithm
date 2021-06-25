package cn.qiyiyu.utils;

import cn.qiyiyu.selectionSort.SelectionSort;

import java.util.Arrays;
import java.util.Random;

/**
 * @author wangqiang
 * @date 2021-06-23 15:01
 */
public class DataChecker {
    static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }
        return arr;
    }

    static void check() {
        int[] arr = generateRandomArray();
        int[] arr2 = new int[arr.length];//一定要拷贝一份数组！！！！
        // 不然的话系统对着arr执行一遍，我自己写的又对arr执行一遍，一验证永远都是正确的
        //因为最后的结果是同一个，只是在arr数组里拍来拍去。
        System.arraycopy(arr, 0, arr2, 0, arr.length);

        Arrays.sort(arr);
        SelectionSort.sort(arr2);
        boolean same = true;
        for (int i = 0; i < arr2.length; i++) {
            if (arr[i]!=arr2[i]) same = false;
        }
        System.out.println(same==true?"right":"wrong");
    }

    public static void main(String[] args) {
        check();
    }
}
