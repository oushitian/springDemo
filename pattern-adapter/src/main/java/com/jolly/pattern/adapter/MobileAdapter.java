package com.jolly.pattern.adapter;

import com.jolly.pattern.origin.MobilePhoto;

/**
 * 描述:手机适配器类，继承原来的拍照方法,又适配了一个打电话的方法(继承属于类适配)
 * 但是注意:类适配会有一个明显的缺点，就是会继承父类的所有共有方法，这可能就会导致不必要的问题产生，
 * 所有推荐用对象适配，即组合代替继承，请看MobileObjAdapter
 *
 * @author fd
 * @create 2018-08-17 9:56
 **/
public class MobileAdapter extends MobilePhoto {

    public void call(String name){
        System.out.println("主人给"+name+"打了一个电话");
    }

}
