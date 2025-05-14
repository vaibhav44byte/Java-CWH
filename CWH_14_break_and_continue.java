package com.company;

public class CWH_14_break_and_continue {
    public static void main(String[] args) {
        // Break and continue using loops
        //for(int i=0; i<5; i++){
        //    System.out.println(i);
        //    System.out.println("java is great");
        //    if (i==2){
        //        System.out.println("Ending the lop");
        //        break;
        /*int i=0;
        do{
            System.out.println(i);
            System.out.println("java is great");
            if (i==2){
                System.out.println("Ending the lop");
                break;
            }
            i++;
        }while(i<5);
        System.out.println("Loop ends here");
         */
        // continue >>
        for (int i = 0; i < 5; i++) {
            if (i>=3) {    // it does not run for i = 2
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }
    }
}