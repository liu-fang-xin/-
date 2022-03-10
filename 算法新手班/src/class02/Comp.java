package class02;

import java.util.Random;

/*对数器   随机生成大量的数据 测试函数的准确性*/
public class Comp {
    //选择排序
    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }
        //交换数组对应索引的值
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    //插入排序
    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) { // 0 ~ i 做到有序
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    //返回一个随机数组arr, arr的长度在[0,maxlength-1],arr中元素的大小在[0,maxValue-1]
    public static int[] lenRandomValueRandom (int maxLen,int maxValue){
        int len = (int) (Math.random()*maxLen);
        int[] ans = new int[len];
        for (int i = 0; i <len; i++) {
            ans[i] = (int)(Math.random()*maxValue);
        }
        return  ans;
    }

    //
    public static boolean isSorted(int[] arr){
        if (arr.length < 2) {
            return true;
        }
        int max=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (max>arr[i]){
                return  false;
            }
           else {
               max = arr[i];
            }
        }
        return true;
    }
    //主函数
    public static void main(String[] args) {
        int[] array  =  lenRandomValueRandom(11,100);
        for (int n:array
             ) {
            System.out.println("n = " + n);
            
        }
        
        int maxLen = 10;
        int maxValue = 100;
        int testCount = 1000;//随机样本的 大小

        boolean flag = true;
        for (int i = 0; i <testCount ; i++) {
            int[] arr1 = lenRandomValueRandom(maxLen,maxValue);
            insertionSort(arr1);
            if (!isSorted(arr1)){
               flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("排序算法正确");
        }else{
            System.out.println();
            System.out.println("您的选择排序函数不正确");
        }
    }
}
