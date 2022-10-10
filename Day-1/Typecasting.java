package com.raghu;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        float num1 = sc.nextFloat();
//        float num2 = sc.nextFloat();
//        float num3 = num1+num2;
//        System.out.println(num3);

//        //(Type casting)
//        int num = (int)(67.56f);
//        System.out.println(num);
//
//        // automatic type promotion in expression
//        int a = 257;
//        byte b = (byte)(a);
//        System.out.println(b);
//        // java follows in unicode values
        byte b = 42;
        char c= 'a';
        short s = 1024;
        int i =50000;
        float f= 5.67f;
        double d= 0.1234;
        double result = (f*b)+(i/c)-(d-s);
        System.out.println((f*b)+" "+(i/c)+" "+(d-s));
        System.out.println(result);

    }
}
