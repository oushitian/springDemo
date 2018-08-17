package com.jolly.pattern.adapter;

/**
 * 描述:
 *
 * @author fd
 * @create 2018-08-17 11:10
 **/
public class InterfaceRealAdapter extends InterfaceAdapter{

    @Override
    public void A() {
        System.out.println("A方法调用");
    }

    @Override
    public void B() {
        System.out.println("B方法调用");
    }
}
