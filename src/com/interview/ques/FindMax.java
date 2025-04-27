package com.interview.ques;

public class FindMax {

   public static int max(int[] arr){
       int max=arr[0];
        for(int i=1;i<arr.length-1;i++){
           if(arr[i]>max){
               max=arr[i];
           }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={1,2,5,10,6,3};
        System.out.println(max(arr));
    }
}
