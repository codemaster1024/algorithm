package cn.qiyiyu.selectionSort;

/**
 * @author wangqiang
 * @date 2021-06-23 13:36
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,6,8,1,7,9,4,2};

        //第一个数排出来了，通过循环
        for (int i = 0; i < arr.length - 1; i++) {//跑起来后精细化length - 1 因为要保证j=i+1不越界
            //定义指向最小值的位置的指针
//            int minPos = 0;
            int minPos = i;

            //遍历数组，找到最小值
//            for (int j = 0; j < arr.length; j++) {
            for (int j = i+1; j < arr.length; j++) {//从排好的位置的后面开始遍历
              /*  if (arr[j] < arr[minPos]) {//如果小于指针的位置就把最小的记录下来
                    minPos = j;
                }*/
                minPos = arr[j] < arr[minPos] ? j : minPos;//优化trick
            }
            //交换最小值和第一个数的位置
/*//            int temp = arr[0];
            int temp = arr[i];
//            arr[0] = arr[minPos];
            arr[i] = arr[minPos];
            arr[minPos] = temp;*/
            swap(arr, i, minPos);
            System.out.println("minPos："+minPos);
            System.out.println("经过第"+i+"次循环后数组的内容");
            print(arr);
          /*  for (int k= 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }*/
            System.out.println();
          /*  for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }*/
            print(arr);
        }



    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static void print (int[] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int[] arr) {


        //第一个数排出来了，通过循环
        for (int i = 0; i < arr.length - 1; i++) {//跑起来后精细化length - 1 因为要保证j=i+1不越界
            //定义指向最小值的位置的指针
//            int minPos = 0;
            int minPos = i;

            //遍历数组，找到最小值
//            for (int j = 0; j < arr.length; j++) {
            for (int j = i + 1; j < arr.length; j++) {//从排好的位置的后面开始遍历
              /*  if (arr[j] < arr[minPos]) {//如果小于指针的位置就把最小的记录下来
                    minPos = j;
                }*/
                minPos = arr[j] < arr[minPos] ? j : minPos;//优化trick
            }
            //交换最小值和第一个数的位置
/*//            int temp = arr[0];
            int temp = arr[i];
//            arr[0] = arr[minPos];
            arr[i] = arr[minPos];
            arr[minPos] = temp;*/
            swap(arr, i, minPos);
            System.out.println("minPos：" + minPos);
            System.out.println("经过第" + i + "次循环后数组的内容");
            print(arr);
          /*  for (int k= 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }*/
            System.out.println();
          /*  for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }*/
            print(arr);
        }
    }
}
