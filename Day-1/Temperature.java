package com.raghu;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the temperature in c: ");
        float tempc = sc.nextFloat();

        float temF= (tempc*1.8f)+32;
        System.out.println("Temperature in F : "+ temF);
    }
}
