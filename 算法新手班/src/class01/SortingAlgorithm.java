package class01;

import java.util.Date;
import java.util.Random;

public class SortingAlgorithm {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");// 测试StringBulider 的replace方法
        sb.replace(1,3,"qwer");
        System.out.println("sb = " + sb);

        int[] arr=getRandomArr(100000);

        //selectSort(arr);
        //bubbleSort(arr);
        insertSort(arr);
        long startTime = System.currentTimeMillis() ;
        selectSort(arr);
        //bubbleSort(arr);
        //insertSort(arr);
        long endTime = System.currentTimeMillis() ;
        System.out.println("usedTime = " + (endTime-startTime));
        //printArr(arr);
    }
/*选择排序算法    每循环一次选出最小值放最前面   选arr.length-1次 就排好序了*/
    public static void selectSort(int[] arr){

        for (int j= 0; j <arr.length-1 ; j++) {
            int minV = arr[j];
            int index = j;
            for (int i = j+1; i <arr.length ; i++) {
              if (minV>arr[i]){
                  minV = arr[i];
                  index = i;
              }
            }
           swapArrV(arr,j,index);
        }
    }
    //冒泡排序  两两比较，前面的比后面的大 就交换    一次大循环后 最大的冒泡到了最后面
    public static void bubbleSort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            boolean flag = true;
            for (int j = 1; j <arr.length-i ; j++) {
                if (arr[j-1]>arr[j]){
                    swapArrV(arr,j-1,j);
                    flag = false;
                }

            }
            if(flag){
                break;
            }
        }
    }

    //插入排序
    public static void insertSort(int[] arr){
        for (int i = 1; i <arr.length ; i++) {
            int newInsertNumIndex = i; //新插入的那个数的索引
            while (newInsertNumIndex-1>=0&&arr[newInsertNumIndex-1]>arr[newInsertNumIndex]    ){
                swapArrV(arr,newInsertNumIndex-1,newInsertNumIndex);
                newInsertNumIndex--;
            }
        }
    }

    //交换 数组 两个索引下的值
    public static void swapArrV(int[] arr , int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] =temp;
    }

    public static void printArr(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"\t");
        }

    }
    //获得长度为length 的随机数组
    public static  int[] getRandomArr(int length){
        Random r = new Random();
        int arr[] = new int[length];
        for (int i = 0; i <length ; i++) {
            arr[i] = r.nextInt(100000)+1;
        }
        return arr;
    }
}
