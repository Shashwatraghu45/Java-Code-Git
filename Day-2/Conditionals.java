package com.raghu;

public class Conditionals {
    public static void main(String[] args) {
        /*
        Syntax of if statements:
        if ( boolean expression T or F ){
        //body
        }
        else{
        //to do
        }
         */

        int salary = 25400;
        if (salary<10000){
            salary+=2000;
            System.out.println(salary);
        } else {
            salary+=1000;
            System.out.println(salary);
        }
    }
}
