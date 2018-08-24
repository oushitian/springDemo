package com.jolly;

import com.google.common.base.Joiner;

/**
 * 描述:
 *
 * @author fd
 * @create 2018-08-24 10:56
 **/
public class JoinerDemo {

    public static void main(String[] args) {
        System.out.println(Joiner.on(' ').join(1, 2, 3));

        StringBuilder sb = new StringBuilder("result:");
        Joiner.on(" ").appendTo(sb, 1, 2, 3);
        System.out.println(sb);//result:1 2 3

        System.out.println(Joiner.on(" ").skipNulls().join(1,null,2));  //跳过空值
        System.out.println(Joiner.on(" ").useForNull("hello").join(1,null,2));  //空值用hell代替
    }
}
