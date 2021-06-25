package cn.qiyiyu.bubbleSort;

/**
 * @author wangqiang
 * @date 2021-06-23 16:06
 */
public class BubbleSort {
    public static void main(String[] args) {

//        int[] arr = {9, 3, 1, 4, 6, 8, 7, 5, 2};
        int[] arr = {2, 3, 1, 4, 6, 8, 7, 5, 9};
        sort(arr);
        print(arr);
    }

    static void sort(int[] arr) {

        //依次把剩余的最大的放入数组的末端
        for (int i = arr.length-1; i >0  ; i--) {
            boolean flag = true;
            //把数组最大的移动到最后的位置
            for (int j = 0; j < i; j++) {//j<i i每次都-- 后面排好的就不用动了
                if (arr[j]>arr[j+1]){//两两相比 大的放后面
                    swap(arr,j,j+1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
       /* for (int i = arr.length-1; i >0 ; i--) {
            findMax(arr,i);
        }*/




    }
/**
 * 不会做的时候就先拆解出来
 **/

    static void findMax(int[] arr, int nmaxPos) {//找到每次传过来的数据，找到“最大”位置的值
        for (int i = 0; i < nmaxPos; i++) {//遍历到“最大”位置就可以了，后面的排好了
            if(arr[i]>arr[i+1]) swap(arr,i,i+1);
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
