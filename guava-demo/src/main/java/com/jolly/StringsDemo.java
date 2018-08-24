package com.jolly;

import com.google.common.base.Strings;

/**
 * 描述:
 *
 * @author fd
 * @create 2018-08-24 13:38
 **/
public class StringsDemo {

    public static void main(String[] args) {
        System.out.println(Strings.isNullOrEmpty(null));  //判断是否null
        System.out.println(Strings.nullToEmpty(null));
        System.out.println(Strings.nullToEmpty("a"));
        System.out.println(Strings.emptyToNull(""));
        System.out.println(Strings.emptyToNull("b"));

        System.out.println(Strings.padStart("7", 3, '0'));
        System.out.println(Strings.padStart("2010", 6, '0'));
        System.out.println(Strings.padEnd("4.", 5, '0'));//"4.000"
        System.out.println(Strings.padEnd("2010", 5, '!'));//"2010"
        System.out.println(Strings.repeat("hey", 3));//"heyheyhey"

        System.out.println(Strings.commonPrefix("aaab", "aac"));//"aa"
        System.out.println(Strings.commonSuffix("aaac", "aac"));//"aac"
    }
}
