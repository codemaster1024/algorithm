package cn.qiyiyu.selectionSort;

/**
 * @author wangqiang
 * @date 2021-06-23 14:18
 */
public class SelectionSortPrem {
    public static void main(String[] args) {
        int[] arr = {5,3,6,8,1,7,9,4,2};
        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }
            System.out.println("minPos:" + minPos);
            swap(arr,minPos,i);
            print(arr);
        }



    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
