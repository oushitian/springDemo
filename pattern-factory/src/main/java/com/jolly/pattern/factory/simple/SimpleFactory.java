package com.jolly.pattern.factory.simple;

import com.jolly.pattern.factory.Bread;
import com.jolly.pattern.factory.Cake;

/**
 * 描述:
 *
 * @author fd
 * @create 2018-08-17 15:24
 **/
public class SimpleFactory {

    public void getFood(String foodName){
        if ("cake".equals(foodName)) {
            new Cake().getFood();
        }else if ("bread".equals(foodName)) {
            new Bread().getFood();
        }
    }

    //此模式需要客户端来指定哪种食物，不灵活，而且新增一种服务需要修改工厂的判断方法，违背了开闭原则(对修改关闭，对扩展开放)
    public static void main(String[] args) {
        new SimpleFactory().getFood("cake");
        new SimpleFactory().getFood("bread");
    }

}
