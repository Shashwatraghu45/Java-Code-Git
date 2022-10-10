package com.raghu;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit");
        int n = sc.nextInt();
        System.out.println("Which Digit you are willing to Count");
        int a=sc.nextInt();
        int count=0;
        while(n > 0){
            int rem = n % 10;
            if(rem==a){
                count++;
            } n= n/10;
        }
        System.out.println("Its Occurs "+count+"times");
    }
}
