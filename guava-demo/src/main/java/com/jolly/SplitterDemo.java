package com.jolly;

import com.google.common.base.Splitter;

/**
 * 描述:
 *
 * @author fd
 * @create 2018-08-24 11:22
 **/
public class SplitterDemo {

    public static void main(String[] args) {
        System.out.println(Splitter.on(' ').split("1 2 3"));//字符串转化成Iterable
        System.out.println(Splitter.onPattern("\\s+").split("1 \t 2 3"));//支持正则
        System.out.println(Splitter.fixedLength(3).split("1 2 3 4 5"));//三个位置以后分割

        System.out.println(Splitter.on("#").withKeyValueSeparator(":").split("1:2#3:4"));//已#拆分,然后已冒号为key,value
    }

}
