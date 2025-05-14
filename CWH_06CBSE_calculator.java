package com.company;
import java.util.Scanner;

public class CWH_06CBSE_calculator {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Marks in Physics");
        float phy = s.nextFloat();
        System.out.println("Enter your marks in Chemistry");
        float che = s.nextFloat();
        System.out.println("Enter your Marks in Maths");
        float math = s.nextFloat();
        System.out.println("Enter your Marks in CS");
        float cs = s.nextFloat();
        System.out.println("Enter your Marks in English");
        float eng = s.nextFloat();


        float total = (phy + che + math + cs + eng)*100/500;
        
        System.out.println("your percentage ;");
        System.out.println(total);





    }

}
