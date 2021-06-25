package cn.qiyiyu.shellsort;

import cn.qiyiyu.utils.ArrayUtils;

/**
 * @author wangqiang
 * @date 2021-06-25 15:59
 */
public class ShellSortKnuth {
    public static void main(String[] args) {
        int[] arr = {9, 6, 11, 3, 5, 12, 8, 7, 10, 15, 14, 4, 1, 13, 2};
        sort(arr);
        ArrayUtils.print(arr);
    }

    public static void sort(int[] arr) {

        int h=1;
        while (h <= arr.length / 3) {//确定适合的gap
            h = h * 3 + 1;
        }

        for (int gap = h; gap > 0; gap=(gap-1)/3) {

            //先把插入排序写进来
            for (int i = gap; i < arr.length; i++) {//从gap开始,i++而不是i+gap
                for (int j = i; j >gap-1 ; j-=gap) {//j--时是和前面数比，现在是要和前面gap的数比
                    //j不能只是>0的，因为j要-gap，那就会越界了。
                    if (arr[j] < arr[j - gap]) {
                        ArrayUtils.swap(arr,j,j-gap);
                    }
                }
            }
        }


       /* for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    arr[j - 1] = arr[j];
                    arr[j - 1] = temp;
                }
            }

        }*/

    }
}
