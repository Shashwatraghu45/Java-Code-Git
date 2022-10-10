package com.raghu;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter three numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

//        if(a>b && a>c){
//            System.out.println(a+" is Largest number");
//        } else if (b>c) {
//            System.out.println(b+" is Largest number");
//
//        }
//        else {
//            System.out.println(c+" is Largest number");
//        }

//        int max =a;
//        if (b>max){
//            max=b;
//        }
//        if (c>max){
//            max=c;
//        }
        int max = Math.max(c,Math.max(a, b));
        System.out.println(max);
    }
}
