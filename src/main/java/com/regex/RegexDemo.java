package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("..xx..");
//        Matcher matcher = pattern.matcher("AAxxBC");
//        System.out.println(matcher.matches());
        System.out.println(Pattern.matches("[a-zA-Z0-9_\\-\\.\\&\\^\\%]+[@](bridgelabz)?+[\\.][a-z]{2,3}", "roshni.123roshni.123@bridgelabz.com"));

    }
}
