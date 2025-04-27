package com.interview.ques;

public class ReverseNumber {

    public static boolean isPalindrome(int num){
//        int num=123;
        int unChangedNum=num;
        int rev=0;
        while(num!=0) {
            int last = num % 10;
            rev= rev *10+last;
            System.out.println(rev);
            num=num/10;
        }
        System.out.println("num"+unChangedNum);
        System.out.println(rev);
        if(rev==unChangedNum){
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args)
    {
        int num=123;
        int rev=0;
        while(num!=0) {
            int last = num % 10;
            rev= rev *10+last;
            num=num/10;
        }
        System.out.println(rev);

        System.out.println( isPalindrome(121));

    }
}
