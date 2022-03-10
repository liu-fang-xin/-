package class03;

import java.util.Arrays;

public class BSExist {
    public static void main(String[] args) {
        int testNum=1000;
        int maxLen = 30;
        int maxValue = 100;

        boolean flag = true;
        for (int i = 0; i <testNum ; i++) {
            int[] randomArr = lenRandomValueRandom(maxLen,maxValue);
            Arrays.sort(randomArr);
            int value = Math.abs((int)((maxValue+1)*Math.random())-(int)(maxValue*Math.random()));//在数组中查找这个数
            if (binarySearch(randomArr,value)!=exist(randomArr,value)){
                flag = false;
                System.out.println("二分查找发错了,你仔细看看");
                break;
            }
        }
        if (flag){
            System.out.println("nice,good job");
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
    //查看sortedArr[]数组中是否存在 num.(最弱智的查找  暴力遍历查询)
    public static boolean exist(int[] sortedArr,int num){
        for (int i = 0; i <sortedArr.length ; i++) {
            if (sortedArr[i]==num){
                return true;
            }
        }
        return false;
    }
    //二分查找 有序数组
    public static boolean binarySearch(int[] sortedArr, int num){
        int L = 0;
        int R = sortedArr.length-1;
        while (L<=R){
            int mid = (L+R)/2;
            if (sortedArr[mid]==num){
                return  true;
            }else if (sortedArr[mid]>num){
                R = mid-1;
            }else {
                L = mid+1;
            }

        }
        return  false;
    }
}
