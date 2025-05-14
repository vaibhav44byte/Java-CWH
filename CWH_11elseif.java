package com.company;
import java.util.Scanner;

public class CWH_11elseif {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        switch (age){
            case 18:
                System.out.println("you are going to be an adult");
                break;
            case 23:
                System.out.println("you are going to join a job");
                break;
            case 60:
                System.out.println("you are going to get retired");
                break;
            default:
                System.out.println("enjoy your life");
        }
        /*
        if (age>56){
            System.out.println("you are experienced");
        }
        else if(age>46){
            System.out.println("you are semi - experienced");
        }
        else if(age>36){
            System.out.println("you are semi semi experienced");
        }
        else{
            System.out.println("you are not experienced");

        */

    }
}
