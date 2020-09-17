package com.slp.chapter2;

import java.util.Arrays;

/**
 * @ClassName MergeSort
 * @Description 归并排序
 * @Author sanglp
 * @Date 2020/9/17 9:01
 * @Version 1.0
 **/
public class MergeSort {
    public static void main(String[] args) {
        int []arr = {9,2,7,3,5,4,6,8,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void sort(int[] arr){
        int temp[] = new int[arr.length];
        sort(arr,0,arr.length-1,temp);

    }

    private static void sort(int [] arr,int left,int right,int []temp){
        if(left<right){
            int mid = (left+right)/2;
            sort(arr,left,mid,temp);//左边归并排序，使得左子序列有序
            sort(arr,mid+1,right,temp);//右边归并排序，使得右子序列有序
            merge(arr,left,mid,right,temp);//将两个有序子数组合并操作
        }
    }

    private static void merge(int[] arr,int left,int mid,int right,int[] temp){
        int i = left;
        int j=mid+1;
        int t=0;
        while (i<=mid&&j<=right){
            if (arr[i]<=arr[j]){
                temp[t++] = arr[i++];
            }else {
                temp[t++] = arr[j++];
            }
        }
        while (i<=mid){
            temp[t++] = arr[i++];
        }
        while (j<=right){
            temp[t++] = arr[j++];

        }
        t = 0;
        //将temp中的元素全部拷贝到原数组中
        while (left<=right){
            arr[left++]=temp[t++];
        }

        System.out.println(Arrays.toString(arr));
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
