package com.company;

public class CWH_08practice_settwo {
    public static void main(String[] args) {
        // problem 1
        String name = " Vaibhav Bhadoriya ";
        name = name.toLowerCase();
        System.out.println(name);

        // problem 2
        String text = "To lower case";
        text = text.replace(" ", "_");
        System.out.println(text);

        // problem 3
        String letter = "Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>", "Vaibhav");
        System.out.println(letter);

        // problem 4
        String mystr = "This string contains  double and  triple spaces";
        System.out.println(mystr.indexOf("  "));
        System.out.println(mystr.indexOf("   "));

        // problem 5
        String myltr = "Dear Vaibhav, \n\tyour profile is nice \n\tthanks";
        System.out.println(myltr);

    }
}
