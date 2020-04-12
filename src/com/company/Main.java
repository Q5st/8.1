package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String s1 = "IT";
        String s2 = "IT Academy";
        Pattern p = Pattern.compile(s1);
        Matcher m = p.matcher(s2);
        System.out.println(m.find());
    }
}
