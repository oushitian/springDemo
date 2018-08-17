package com.jolly.pattern.decorator;


import com.jolly.pattern.origin.MobilePhoto;
import com.jolly.pattern.origin.MobilePhotoImpl;

/**
 * 描述:装饰者在保留原有的功能上在做扩展，
 * 装饰者和被装饰者有着层级关系，比如io中的类就是装饰者模式的经典应用
 *
 *
 * 简单总结一下装饰者模式和适配器模式:
 * 1,装饰者强调的是扩展，保证原来的功能继续有用     而适配器主要是转化，不能保证原有功能的有用
 * 2,装饰者要有层级依赖关系，即实现同一个接口或者简洁实现同一个接口      而适配器没有必要的层级关系
 *
 * @author fd
 * @create 2018-08-17 11:29
 **/
public class MobilePhotoAndCallDecorator implements MobilePhotoAndCall {

    private MobilePhoto mobilePhoto;

    public MobilePhotoAndCallDecorator(MobilePhoto mobilePhoto){
        this.mobilePhoto = mobilePhoto;
    }

    public void call() {
        System.out.println("打电话");
        photo();
    }

    public void photo() {
        mobilePhoto.photo();
    }

    public static void main(String[] args) {
        MobilePhotoAndCallDecorator mobilePhotoAndCallDecorator = new MobilePhotoAndCallDecorator(new MobilePhotoImpl());
        mobilePhotoAndCallDecorator.call();
    }
}
