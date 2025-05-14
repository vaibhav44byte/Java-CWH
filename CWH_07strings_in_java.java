package com.company;

public class CWH_07strings_in_java {
    public static void main(String[] args) {
        // to count the lenght of string !!
        String name = "Vaibhav";
        System.out.println(name);
        int num = name.length();
        System.out.println(num);

        // to lower case the given string
        String lstr = name.toLowerCase();
        System.out.println(lstr);

        // to upper case the given string
        String ustr = name.toUpperCase();
        System.out.println(ustr);

        // to trim the given string
        String nontrimmedstring = "   Vaibhav   ";
        // method 1
        System.out.println(nontrimmedstring.trim());
        // method 2
        String trimmedstring = nontrimmedstring.trim();
        System.out.println(trimmedstring);
    }
}
