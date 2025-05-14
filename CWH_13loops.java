package com.company;
import java.util.Scanner;

public class CWH_13loops {
    public static void main(String[] args) {
        // FOR loop > for(initialisation;condition;updation){

        //for(int c = 0; c < 100; c = c + 1){
        //    System.out.println("hello world");
        //}
        //for(int cnt = 0; cnt < 11; cnt++) {
        //System.out.print(cnt + " ");

        //}
        // WHILE loop
        //int i = 0;
        //while(i<11){
        //  System.out.println(i);
        //    i = i + 1;
        // do while
        //}
        //do {
        //    System.out.println(i);
        //    i = i + 1;
        //} while(i < 20);
        System.out.println("Enter a number"+ " ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int sum = 0;
        for(int i=0; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
