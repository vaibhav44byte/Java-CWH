package com.company;
import java.util.Scanner;

public class CWH_09Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("Yes you are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
    }
}
