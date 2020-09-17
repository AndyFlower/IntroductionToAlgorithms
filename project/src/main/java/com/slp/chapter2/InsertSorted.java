package com.slp.chapter2;

/**
 * @ClassName InsertSorted
 * @Description 插入排序
 * @Author sanglp
 * @Date 2020/9/16 9:54
 * @Version 1.0
 **/
public class InsertSorted {
    public static void main(String[] args) {
        int [] arr = new int[]{2,1,4,3};
        insertSortedAsc(arr);
        int [] arr1 = new int[]{7,2,9,3};
        insertSortedDesc(arr1);
    }

    /**
     * 非递减
     * @param arr
     * @return
     */
    public static int[] insertSortedAsc(int [] arr){
        int len = arr.length;//数组的长度
        for(int j=1;j<arr.length;j++){//这里的j=1是因为java中数组下标是从0开始的
            int pointKey = arr[j];//待处理的程序
            int i = j-1;//i从前一个元素开始
            while(i>=0&&arr[i]>pointKey){
                arr[i+1]=arr[i];
                i--;
            }
            arr[i+1]=pointKey;
            printArr(arr);
            System.out.println("");
        }
        return arr;
    }

    /**
     * 非递增
     * @param arr
     * @return
     */
    public static int[] insertSortedDesc(int [] arr){
        int len = arr.length;//数组的长度
        for(int j=1;j<arr.length;j++){//这里的j=1是因为java中数组下标是从0开始的
            int pointKey = arr[j];//待处理的程序
            int i = j-1;//i从前一个元素开始
            while(i>=0&&arr[i]<pointKey){
                arr[i+1]=arr[i];
                i--;
            }
            arr[i+1]=pointKey;
            printArr(arr);
            System.out.println("");
        }
        return arr;
    }

    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(i==0){
                System.out.print(arr[i]);
            }else {
                System.out.print(","+arr[i]);
            }
        }

    }
}
