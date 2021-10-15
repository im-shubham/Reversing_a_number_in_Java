//Reversing a number Program in Java...


package com.java;


import java.util.Scanner;

class Reverse{
    public static void main(String[] args) {
//        5432 --->> 2345
//        5432%10 --->>> rem//        rev=rev*10+rem;
//        no--->>no/10
        int n,rem,rev=0;


        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        n= sc.nextInt();



        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("the Number After reversing is "+ rev);



    }
}
