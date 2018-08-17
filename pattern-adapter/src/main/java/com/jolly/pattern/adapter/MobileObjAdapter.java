package com.jolly.pattern.adapter;

import com.jolly.pattern.origin.MobilePhoto;

/**
 * 描述:对象适配，可以选择需要适配的具体方法，而没必要继承所有父类的公共方法
 *
 * @author fd
 * @create 2018-08-17 10:40
 **/
public class MobileObjAdapter {

    private MobilePhoto mobilePhoto;

    public MobileObjAdapter(MobilePhoto mobilePhoto){
        this.mobilePhoto = mobilePhoto;
    }

    public void photo(String name){
        mobilePhoto.photo(name);
    }
}
