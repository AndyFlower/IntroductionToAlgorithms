package com.slp.chapter2;

/**
 * @ClassName DivideAndConquer
 * @Description TODO
 * @Author sanglp
 * @Date 2020/9/17 8:22
 * @Version 1.0
 **/
public class DivideAndConquer {

    public static void main(String[] args) {
        System.out.println(multiply(2,4));
    }

    public static int multiply(int a,int b){
        if(b==1){
            return a;
        }
        if(b%2==0){
            return multiply(a,b/2)*multiply(a,b/2);
        }else{
            return multiply(a,b/2)*multiply(a,b/2)*a;
        }

    }
}
