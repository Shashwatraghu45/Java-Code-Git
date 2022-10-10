package com.raghu;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int num=0;
        int temp = 0;
        while (n > 0) {

            temp = n % 10;
            num = num * 10 + temp;
            n=n/10;

        }
        System.out.println(num);


    }
}
