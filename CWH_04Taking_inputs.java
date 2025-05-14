package com.company;
import java.util.Scanner;

public class CWH_04Taking_inputs {
    public static void main(String[] args) {
      System.out.println("taking input from the user");
      Scanner sc = new Scanner(System.in);
//        System.out.println("Enter No 1");
//        float a = sc.nextFloat();
//        System.out.println("Enter No 2");
//        float b = sc.nextFloat();
//      boolean bb = sc.hasNextInt();
//      System.out.println(bb);
      boolean num = sc.hasNextInt();
      System.out.println(num);
    }
}
